package com.example.demo.web;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.model.TiLike;
import com.example.demo.model.dto.GuanZhuDTO;
import com.example.demo.service.TiLikeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by taoranran on 2018/11/09.
*/
@RestController
@RequestMapping("/ti/like")
public class TiLikeController {
    @Resource
    private TiLikeService tiLikeService;

    @PostMapping("/add")
    public Result add(@RequestBody TiLike tiLike) {
        tiLikeService.save(tiLike);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tiLikeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/dete")
    public int delete(@RequestBody GuanZhuDTO guanZhuDTO) {
       int n = tiLikeService.deleteTiLike(guanZhuDTO);
        return n;
    }

    @PostMapping("/update")
    public Result update(TiLike tiLike) {
        tiLikeService.update(tiLike);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TiLike tiLike = tiLikeService.findById(id);
        return ResultGenerator.genSuccessResult(tiLike);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TiLike> list = tiLikeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/ti")
    public Result getTiLike(@RequestBody GuanZhuDTO guanZhuDTO){
        return tiLikeService.getTiLike(guanZhuDTO);
    }
}
