package com.example.demo.dao;

import com.example.demo.Tester;
import com.example.demo.model.dto.GuanZhuDTO;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/11/9.
 */
public class TiLikeMapperTest extends Tester{
    @Resource
    private TiLikeMapper tiLikeMapper ;
    @Test
    public void match() throws Exception {

        System.out.println(tiLikeMapper.match(1,1).getId());
    }



}