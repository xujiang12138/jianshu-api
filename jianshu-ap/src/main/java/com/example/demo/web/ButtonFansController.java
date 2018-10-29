package com.example.demo.web;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.model.ButtonFans;
import com.example.demo.service.ButtonFansService;
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
@RequestMapping("/button/fans")
public class ButtonFansController {
    @Resource
    private ButtonFansService buttonFansService;

    @PostMapping("/add")
    public Result add(ButtonFans buttonFans) {
        buttonFansService.save(buttonFans);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        buttonFansService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ButtonFans buttonFans) {
        buttonFansService.update(buttonFans);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ButtonFans buttonFans = buttonFansService.findById(id);
        return ResultGenerator.genSuccessResult(buttonFans);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ButtonFans> list = buttonFansService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
