package com.example.demo.web;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.model.CreatLike;
import com.example.demo.service.CreatLikeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by taoranran on 2018/11/13.
*/
@RestController
@RequestMapping("/creat/like")
public class CreatLikeController {
    @Resource
    private CreatLikeService creatLikeService;

    @PostMapping("/add")
    public Result add(@RequestBody CreatLike creatLike) {
        creatLikeService.save(creatLike);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        creatLikeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(CreatLike creatLike) {
        creatLikeService.update(creatLike);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        CreatLike creatLike = creatLikeService.findById(id);
        return ResultGenerator.genSuccessResult(creatLike);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CreatLike> list = creatLikeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
