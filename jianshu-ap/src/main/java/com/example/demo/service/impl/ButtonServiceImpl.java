package com.example.demo.service.impl;

import com.example.demo.dao.ButtonMapper;
import com.example.demo.model.Button;
import com.example.demo.model.vo.ButtonArticleVo;
import com.example.demo.model.vo.FanVo;
import com.example.demo.service.ButtonService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class ButtonServiceImpl extends AbstractService<Button> implements ButtonService {
    @Resource
    private ButtonMapper buttonMapper;

    @Override
    public List<FanVo> getFan(Integer id) {
        return buttonMapper.getFan(id);
    }

    @Override
    public List<ButtonArticleVo> getButtonArticle(Integer id) {
        return  buttonMapper.geButtonArVo(id);
    }
}
