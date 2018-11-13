package com.example.demo.web;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.model.Article;
import com.example.demo.model.vo.ArticleCreatorVo;
import com.example.demo.model.vo.DiaLogNameVO;
import com.example.demo.model.vo.TitleArticleVo;
import com.example.demo.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by taoranran on 2018/11/06.
*/
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @PostMapping("/add")
    public Result add(Article article) {
        articleService.save(article);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        articleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Article article) {
        articleService.update(article);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail/{id}")
    public Result detail(@PathVariable Integer id) {
        Article article = articleService.findById(id);
        return ResultGenerator.genSuccessResult(article);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Article> list = articleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/titleArticle")
    public Result titleArticle(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TitleArticleVo> list = articleService.getTitleArticle();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/diaName/{id}")
    public Result diaName(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size ,@PathVariable Integer id) {
        PageHelper.startPage(page, size);
        List<DiaLogNameVO> list = articleService.getDiaLogName(id);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @PostMapping("/creator/{id}")
    public Result creatorVo(@PathVariable Integer id) {
        ArticleCreatorVo articleCreatorVo = articleService.getArticleCreatorVo(id);
        return ResultGenerator.genSuccessResult(articleCreatorVo);

    }
}
