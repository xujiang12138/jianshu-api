package com.example.demo.dao;

import com.example.demo.Tester;
import com.example.demo.model.Button;
import com.example.demo.model.vo.ButtonArticleVo;
import com.example.demo.model.vo.FanVo;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/11/5.
 */
public class ButtonMapperTest extends Tester {
    @Resource
    private  ButtonMapper buttonMapper;
    @Test
    public void getFan() throws Exception {
        List<FanVo> fanVoList = buttonMapper.getFan(1);
        System.out.println(fanVoList);
    }

    @Test
    public void getButtonArticleVo() throws Exception{
        List<ButtonArticleVo> buttonArticleVos = buttonMapper.geButtonArVo(1);
        System.out.println(buttonArticleVos);
    }

    @Test
    public void insetButton() throws  Exception{
        Button button = new Button();
        button.setCreator("简书");
        Button button1 = buttonMapper.selectOne(button);
        button1.setCreator("daddad");
        buttonMapper.updateByPrimaryKey(button1);
    }

}