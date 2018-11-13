package com.example.demo.dao;

import com.example.demo.core.Mapper;
import com.example.demo.model.Article;
import com.example.demo.model.vo.AllTwoVo;
import com.example.demo.model.vo.ArticleCreatorVo;
import com.example.demo.model.vo.DiaLogNameVO;
import com.example.demo.model.vo.TitleArticleVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ArticleMapper extends Mapper<Article> {
    @Select("SELECT s.title FROM article s WHERE  user_id = #{id}")
    List<AllTwoVo> getUserArticle(Integer id);
    @Select("select s.`article_id`as articleId  ,s.comments ,s.likes , s.summary , s.thumbnail , s.title ,s.write_time as writeTime, a.nick_name as nickName from article s , sys_user a where a.id = s.`user_id`")
    List<TitleArticleVo> getTitleArticle();
    @Select("SELECT s.`avatar`,s.`nick_name` as nickName,s.`like_count` as likeCount ,s.`words_count` as wordsCont FROM sys_user s,article a WHERE a.`user_id` = s.`id` AND a.`article_id` = #{id}")
    ArticleCreatorVo getArticleCreatorVo(Integer id);
    @Select("SELECT s.title  FROM article s WHERE user_id = #{id}")
    List<DiaLogNameVO> getDiaLogVO(Integer id);

    @Update("UPDATE article  SET likes =likes+1 WHERE article_id =#{id}")
    int updateArticle(Integer id);






}