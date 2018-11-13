package com.example.demo.web;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.model.Essay;
import com.example.demo.model.vo.EssayVo;
import com.example.demo.service.EssayService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by taoranran on 2018/11/09.
*/
@RestController
@RequestMapping("/essay")
public class EssayController {
    @Resource
    private EssayService essayService;

    @PostMapping("/add")
    public Result add(Essay essay) {
        essayService.save(essay);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        essayService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Essay essay) {
        essayService.update(essay);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Essay essay = essayService.findById(id);
        return ResultGenerator.genSuccessResult(essay);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Essay> list = essayService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/aressay/{id}")
    public Result aressay(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @PathVariable Integer id) {
        PageHelper.startPage(page, size);
        List<EssayVo> list = essayService.getArticleEssay(id);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
