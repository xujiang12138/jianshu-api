package com.example.demo.dao;

import com.example.demo.core.Mapper;
import com.example.demo.model.Essay;
import com.example.demo.model.vo.EssayVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EssayMapper extends Mapper<Essay> {
    @Select("SELECT e.`comment_time`AS commentTime,e.`content` ,s.`avatar`,s.`nick_name`AS nickName FROM essay e ,article a , sys_user s WHERE a.`article_id`=e.`article_id` AND e.`user_id` = s.`id` AND a.`article_id`=#{id}")
    List<EssayVo> getArticleEssay(Integer id) ;
}