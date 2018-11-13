package com.example.demo.web;
import com.example.demo.core.Result;
import com.example.demo.core.ResultGenerator;
import com.example.demo.model.SysUser;
import com.example.demo.model.dto.SysUserDTO;
import com.example.demo.model.vo.AllUserVO;
import com.example.demo.model.vo.HotVo;
import com.example.demo.service.SysUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Created by taoranran on 2018/10/25.
*/
@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @PostMapping("/login")
    public Result signIn(@RequestBody SysUserDTO sysUserDTO) {
        return sysUserService.userLogin(sysUserDTO);
    }

    @PostMapping("/add")
    public Result add(SysUser sysUser) {
        sysUserService.save(sysUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        sysUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(SysUser sysUser) {
        sysUserService.update(sysUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        SysUser sysUser = sysUserService.findById(id);
        return ResultGenerator.genSuccessResult(sysUser);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysUser> list = sysUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/a")
    public Result a(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<AllUserVO> maps = sysUserService.getAllUser();
        PageInfo pageInfo = new PageInfo(maps);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    @PostMapping("/hot")
    public Result hot(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<HotVo> hotUser = sysUserService.getHotUser();
        PageInfo pageInfo = new PageInfo(hotUser);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
