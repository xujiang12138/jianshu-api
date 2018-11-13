package com.example.demo.service.impl;

import com.example.demo.core.Result;
import com.example.demo.dao.ArticleMapper;
import com.example.demo.dao.SysUserMapper;
import com.example.demo.model.Article;
import com.example.demo.model.SysUser;
import com.example.demo.model.dto.SysUserDTO;
import com.example.demo.model.vo.AllOneVo;
import com.example.demo.model.vo.AllTwoVo;
import com.example.demo.model.vo.AllUserVO;
import com.example.demo.model.vo.HotVo;
import com.example.demo.service.SysUserService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;
    @Resource
    private ArticleMapper articleMapper ;



    @Override
    public Result userLogin(SysUserDTO sysUserDTO) {
        SysUser sysUser = new SysUser();
        sysUser.setEmail(sysUserDTO.getEmail());
        SysUser sysUser1 = sysUserMapper.selectOne(sysUser);
        //邮箱有效
        if (sysUser1 != null) {
            //判断密码是否正确
            if (sysUserDTO.getPassword().equals(sysUser1.getPassword())) {
                return new Result(200, "login success", sysUser1);
            } else {
                return new Result(0, "password wrong");
            }
        } else {
            return new Result(0, "email wrong");
        }
    }

    @Override
    public List<HotVo> getHotUser() {
        return sysUserMapper.getHotSysUser();
    }

    @Override
    public List<AllUserVO> getAllUser() {
        List<AllUserVO> voArrayList =  new ArrayList<>();
        List<AllOneVo> allOneVos = sysUserMapper.getOneUser(); //所有用户
        for(int i =0 ;i<allOneVos.size();i++){
            AllUserVO allUserVO =new AllUserVO();//需要的用户
            List<AllTwoVo> articles = articleMapper.getUserArticle(allOneVos.get(i).getId());
            allUserVO.setId(i+1);
            allUserVO.setAvatar(allOneVos.get(i).getAvatar());
            allUserVO.setDescription(allOneVos.get(i).getDescription());
            allUserVO.setNick_name(allOneVos.get(i).getNick_name());
            allUserVO.setArticleOne(articles.get(0).getTitle());
            allUserVO.setArticleTwo(articles.get(1).getTitle());
            allUserVO.setArticleThree(articles.get(2).getTitle());
            voArrayList.add(allUserVO);
        }

        return voArrayList;
    }

}
