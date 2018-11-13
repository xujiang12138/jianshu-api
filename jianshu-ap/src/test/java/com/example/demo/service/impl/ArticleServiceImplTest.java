package com.example.demo.service.impl;

import com.example.demo.Tester;
import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/11/13.
 */
public class ArticleServiceImplTest extends Tester {
    @Resource
    private ArticleService articleService;
    @Test
    public void updateArticle() throws Exception {
        int a = articleService.updateArticle(1);
        System.out.println(a);
    }

}