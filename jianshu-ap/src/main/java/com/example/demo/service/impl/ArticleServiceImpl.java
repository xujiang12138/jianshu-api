package com.example.demo.service.impl;

import com.example.demo.dao.ArticleMapper;
import com.example.demo.model.Article;
import com.example.demo.model.vo.ArticleCreatorVo;
import com.example.demo.model.vo.DiaLogNameVO;
import com.example.demo.model.vo.TitleArticleVo;
import com.example.demo.service.ArticleService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by taoranran on 2018/11/06.
 */
@Service
@Transactional
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<TitleArticleVo> getTitleArticle() {
        return articleMapper.getTitleArticle();
    }

    @Override
    public ArticleCreatorVo getArticleCreatorVo(Integer id) {
        return articleMapper.getArticleCreatorVo(id);
    }

    @Override
    public List<DiaLogNameVO> getDiaLogName(Integer id) {
        return articleMapper.getDiaLogVO(id);
    }

    @Override
    public int updateArticle(Integer id) {
        int a = articleMapper.updateArticle(1);
        return a;

    }
}
