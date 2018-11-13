package com.example.demo.service.impl;

import com.example.demo.Tester;
import com.example.demo.service.ButtonService;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/11/6.
 */
public class ButtonServiceImplTest  extends Tester{
    @Resource
    private ButtonService buttonService;
    @Test
    public void getButtonArticle() throws Exception {
        System.out.println(buttonService.getButtonArticle(1));
    }

}