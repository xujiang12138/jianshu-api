package com.example.demo.dao;

import com.example.demo.Tester;
import com.example.demo.model.vo.HotVo;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/11/5.
 */

public class SysUserMapperTest extends Tester{
    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    public void getHotSysUser() throws Exception {

        System.out.println(sysUserMapper.getOneUser());
    }

    @Test
    public void getAllUser() throws Exception{

    }

}