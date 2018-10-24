package com.example.jianshu.controller;


import com.example.jianshu.domai.LoginUser;
import com.example.jianshu.service.ButtonService;
import com.example.jianshu.service.CarouselService;
import com.example.jianshu.service.SysUserService;
import com.example.jianshu.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:8081")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @Resource
    private CarouselService carouselService;

    @Resource
    private ButtonService buttonService;

    @RequestMapping(value = "/sign_in", method = RequestMethod.POST)
    public ResponseUtil signIn(@RequestBody LoginUser loginUser) {
        System.out.println(loginUser);
        return sysUserService.userLogin(loginUser);
    }
    //热门作者
    @RequestMapping(value = "/hot", method = RequestMethod.GET)
    public ResponseUtil getHotUsers() {
        return new ResponseUtil(0, "get hot users!", sysUserService.getHotUsers());
    }

    //轮播
    @RequestMapping(value = "/car", method =RequestMethod.GET)
    public  ResponseUtil getCarousel(){
        System.out.println(carouselService.getCarousels());
        return  new ResponseUtil(0,"get Carousel", carouselService.getCarousels());
    }
    @RequestMapping(value = "/button",method = RequestMethod.GET)
    public ResponseUtil getButtonName(){
        return  new ResponseUtil(0,"getButtonName",buttonService.getButtonName());
    }

    @RequestMapping(value = "/button/{id}",method = RequestMethod.GET)
    public ResponseUtil getButton(@PathVariable Integer id){
        return  new ResponseUtil(0,"getButton",buttonService.getButton(id));
    }


}
