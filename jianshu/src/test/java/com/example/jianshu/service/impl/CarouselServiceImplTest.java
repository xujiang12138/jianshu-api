package com.example.jianshu.service.impl;

import com.example.jianshu.dao.CarouselRepository;
import com.example.jianshu.entity.Carousel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/10/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CarouselServiceImplTest {
    @Resource
    private CarouselRepository carouselRepository;
    @Test
    public void getCarousels() throws Exception {
        List<Carousel> carousels = carouselRepository.findAll();
        System.out.println(carousels);
    }

}