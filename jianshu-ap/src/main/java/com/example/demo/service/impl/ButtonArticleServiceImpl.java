package com.example.demo.service.impl;

import com.example.demo.dao.ButtonArticleMapper;
import com.example.demo.model.ButtonArticle;
import com.example.demo.service.ButtonArticleService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class ButtonArticleServiceImpl extends AbstractService<ButtonArticle> implements ButtonArticleService {
    @Resource
    private ButtonArticleMapper buttonArticleMapper;

}
