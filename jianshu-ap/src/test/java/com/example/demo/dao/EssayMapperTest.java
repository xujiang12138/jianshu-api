package com.example.demo.dao;

import com.example.demo.Tester;
import com.example.demo.model.vo.EssayVo;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/11/9.
 */
public class EssayMapperTest extends Tester {
    @Resource
    private EssayMapper essayMapper;
    @Test
    public void getArticleEssay() throws Exception {
        List<EssayVo> essayVos = essayMapper.getArticleEssay(1);
        System.out.println(essayVos);
    }

}