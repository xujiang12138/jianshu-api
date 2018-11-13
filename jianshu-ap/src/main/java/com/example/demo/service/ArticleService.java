package com.example.demo.service;
import com.example.demo.model.Article;
import com.example.demo.core.Service;
import com.example.demo.model.vo.ArticleCreatorVo;
import com.example.demo.model.vo.DiaLogNameVO;
import com.example.demo.model.vo.TitleArticleVo;
import io.swagger.models.auth.In;

import java.util.List;


/**
 * Created by taoranran on 2018/11/06.
 */
public interface ArticleService extends Service<Article> {
    List<TitleArticleVo> getTitleArticle();
    ArticleCreatorVo getArticleCreatorVo(Integer id);
    List<DiaLogNameVO> getDiaLogName(Integer id);
    int  updateArticle(Integer id);

}
