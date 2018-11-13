package com.example.demo.service.impl;

import com.example.demo.dao.CommentMapper;
import com.example.demo.model.Comment;
import com.example.demo.service.CommentService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/11/09.
 */
@Service
@Transactional
public class CommentServiceImpl extends AbstractService<Comment> implements CommentService {
    @Resource
    private CommentMapper commentMapper;

}
