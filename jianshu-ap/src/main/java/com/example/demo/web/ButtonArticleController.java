package com.example.demo.web;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.model.ButtonArticle;
import com.example.demo.service.ButtonArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by taoranran on 2018/10/25.
*/
@RestController
@RequestMapping("/button/article")
public class ButtonArticleController {
    @Resource
    private ButtonArticleService buttonArticleService;

    @PostMapping("/add")
    public Result add(ButtonArticle buttonArticle) {
        buttonArticleService.save(buttonArticle);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        buttonArticleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ButtonArticle buttonArticle) {
        buttonArticleService.update(buttonArticle);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ButtonArticle buttonArticle = buttonArticleService.findById(id);
        return ResultGenerator.genSuccessResult(buttonArticle);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ButtonArticle> list = buttonArticleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
