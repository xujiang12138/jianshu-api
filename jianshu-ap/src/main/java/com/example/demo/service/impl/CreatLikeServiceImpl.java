package com.example.demo.service.impl;

import com.example.demo.dao.CreatLikeMapper;
import com.example.demo.model.CreatLike;
import com.example.demo.service.CreatLikeService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/11/13.
 */
@Service
@Transactional
public class CreatLikeServiceImpl extends AbstractService<CreatLike> implements CreatLikeService {
    @Resource
    private CreatLikeMapper creatLikeMapper;

}
