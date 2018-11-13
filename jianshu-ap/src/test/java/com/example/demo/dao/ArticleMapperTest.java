package com.example.demo.dao;

import com.example.demo.Tester;
import com.example.demo.model.Article;
import com.example.demo.model.vo.AllTwoVo;
import com.example.demo.model.vo.ArticleCreatorVo;
import com.example.demo.model.vo.TitleArticleVo;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/11/6.
 */
public class ArticleMapperTest extends Tester{
    @Resource
    private ArticleMapper articleMapper;
    @Test
    public void getUserArticle() throws Exception {
        List<AllTwoVo> articles = articleMapper.getUserArticle(1);
        System.out.println(articles);
    }

    @Test
    public void getTitleArticle() throws  Exception{
        List<TitleArticleVo> articleVos = articleMapper.getTitleArticle();
        System.out.println(articleVos);
    }

    @Test
    public void getArticleCreatorVo() throws  Exception{
        ArticleCreatorVo articleCreatorVo = articleMapper.getArticleCreatorVo(1);
        System.out.println(articleCreatorVo);
        System.out.println(articleMapper.getDiaLogVO(1));
    }

    @Test
    public  void updateArticle() throws Exception{
      Article article = new Article();
      article.setLikes(200);
      articleMapper.insert(article);

    }


}