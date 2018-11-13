package com.example.demo.service;
import com.example.demo.model.Essay;
import com.example.demo.core.Service;
import com.example.demo.model.vo.EssayVo;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by taoranran on 2018/11/09.
 */

public interface EssayService extends Service<Essay> {
        List<EssayVo> getArticleEssay(Integer id);
}
