package com.example.demo.service.impl;

import com.example.demo.dao.LikeMapper;
import com.example.demo.model.Like;
import com.example.demo.service.LikeService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/11/06.
 */
@Service
@Transactional
public class LikeServiceImpl extends AbstractService<Like> implements LikeService {
    @Resource
    private LikeMapper likeMapper;

}
