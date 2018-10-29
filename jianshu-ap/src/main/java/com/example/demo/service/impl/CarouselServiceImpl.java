package com.example.demo.service.impl;

import com.example.demo.dao.CarouselMapper;
import com.example.demo.model.Carousel;
import com.example.demo.service.CarouselService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class CarouselServiceImpl extends AbstractService<Carousel> implements CarouselService {
    @Resource
    private CarouselMapper carouselMapper;

}
