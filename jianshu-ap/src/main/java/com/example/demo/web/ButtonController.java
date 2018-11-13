package com.example.demo.web;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.model.Button;
import com.example.demo.model.vo.ButtonArticleVo;
import com.example.demo.model.vo.FanVo;
import com.example.demo.service.ButtonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by taoranran on 2018/10/25.
*/
@RestController
@RequestMapping("/button")
public class ButtonController {
    @Resource
    private ButtonService buttonService;

    @PostMapping("/add")
    public Result add(Button button) {
        buttonService.save(button);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        buttonService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Button button) {
        buttonService.update(button);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail/{id}")
    public Result detail(@PathVariable Integer id) {
        Button button = buttonService.findById(id);
        return ResultGenerator.genSuccessResult(button);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Button> list = buttonService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/fan/{id}")
    public Result fan(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size,@PathVariable Integer id) {
        PageHelper.startPage(page, size);
        List<FanVo> list = buttonService.getFan(id);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/btnArticle/{id}")
    public Result btnArticle(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size,@PathVariable Integer id) {
        PageHelper.startPage(page, size);
        List<ButtonArticleVo> list = buttonService.getButtonArticle(id);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
