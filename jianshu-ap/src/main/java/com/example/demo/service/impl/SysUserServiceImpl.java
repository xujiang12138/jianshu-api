package com.example.demo.service.impl;

import com.example.demo.core.Result;
import com.example.demo.dao.SysUserMapper;
import com.example.demo.model.SysUser;
import com.example.demo.model.dto.SysUserDTO;
import com.example.demo.service.SysUserService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

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
}
