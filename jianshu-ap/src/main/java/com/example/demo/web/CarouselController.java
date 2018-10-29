package com.example.demo.web;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.model.Carousel;
import com.example.demo.service.CarouselService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by taoranran on 2018/10/25.
*/
@RestController
@RequestMapping("/carousel")
public class CarouselController {
    @Resource
    private CarouselService carouselService;

    @PostMapping("/add")
    public Result add(Carousel carousel) {
        carouselService.save(carousel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        carouselService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Carousel carousel) {
        carouselService.update(carousel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Carousel carousel = carouselService.findById(id);
        return ResultGenerator.genSuccessResult(carousel);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Carousel> list = carouselService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
