package com.example.demo.service.impl;

import com.example.demo.dao.ButtonMapper;
import com.example.demo.model.Button;
import com.example.demo.service.ButtonService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class ButtonServiceImpl extends AbstractService<Button> implements ButtonService {
    @Resource
    private ButtonMapper buttonMapper;

}
