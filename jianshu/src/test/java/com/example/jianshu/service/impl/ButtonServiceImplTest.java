package com.example.jianshu.service.impl;

import com.example.jianshu.dao.ButtonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/10/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ButtonServiceImplTest {
    @Resource
    private ButtonRepository buttonRepository;
    @Test
    public void getButtonName() throws Exception {
        System.out.println(buttonRepository.findAll());
    }
    @Test
    public void getButton() throws Exception{
        System.out.println(buttonRepository.findById(1).get());
    }

}