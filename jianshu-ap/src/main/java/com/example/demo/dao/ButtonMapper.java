package com.example.demo.dao;

import com.example.demo.core.Mapper;
import com.example.demo.model.Button;
import com.example.demo.model.vo.ButtonArticleVo;
import com.example.demo.model.vo.FanVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ButtonMapper extends Mapper<Button> {
    @Select("SELECT c.`author_id`, c.`avatar` FROM button  b ,button_fans c WHERE   b.`id` = c.`Fans_id` AND b.`id`=#{id}")
    List<FanVo> getFan(Integer id);

    @Select("SELECT c.`title`,c.`article_id`,c.`thumbnail`,c.`summary`, c.`likes`,c.`comments` ,a.`nick_name`FROM button  b ,article c ,sys_user a WHERE  c.`user_id` =a.`id`AND b.`id` = c.`button_id` AND b.`id`=#{id}")
    List<ButtonArticleVo> geButtonArVo(Integer id);
}