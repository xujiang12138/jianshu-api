package com.example.jianshu.service.impl;

import com.example.jianshu.dao.CarouselRepository;
import com.example.jianshu.entity.Carousel;
import com.example.jianshu.service.CarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/10/22.
 */
@Service
public class CarouselServiceImpl implements CarouselService {
    @Resource
    private CarouselRepository carouselRepository;
    @Override
    public List<Carousel> getCarousels() {
        return carouselRepository.findAll();
    }
}
