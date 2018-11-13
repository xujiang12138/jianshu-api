package com.example.demo.service.impl;

import com.example.demo.dao.EssayMapper;
import com.example.demo.model.Essay;
import com.example.demo.model.vo.EssayVo;
import com.example.demo.service.EssayService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by taoranran on 2018/11/09.
 */
@Service
@Transactional
public class EssayServiceImpl extends AbstractService<Essay> implements EssayService {
    @Resource
    private EssayMapper essayMapper;

    @Override
    public List<EssayVo> getArticleEssay(Integer id) {
        return essayMapper.getArticleEssay(id);
    }
}
