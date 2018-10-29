package com.example.demo.service.impl;

import com.example.demo.dao.ButtonFansMapper;
import com.example.demo.model.ButtonFans;
import com.example.demo.service.ButtonFansService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class ButtonFansServiceImpl extends AbstractService<ButtonFans> implements ButtonFansService {
    @Resource
    private ButtonFansMapper buttonFansMapper;

}
