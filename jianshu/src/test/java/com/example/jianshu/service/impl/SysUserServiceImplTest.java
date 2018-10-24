package com.example.jianshu.service.impl;

import com.example.jianshu.dao.SysUserRepositry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/10/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {
    @Resource
    private SysUserRepositry sysUserRepositry;
    @Test
    public void getHotUsers() throws Exception {
        System.out.println(sysUserRepositry.findHotUsers());
    }

}