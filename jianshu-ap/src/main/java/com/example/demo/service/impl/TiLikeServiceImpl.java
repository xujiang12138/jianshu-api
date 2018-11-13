package com.example.demo.service.impl;

import com.example.demo.core.Result;
import com.example.demo.dao.TiLikeMapper;
import com.example.demo.model.TiLike;
import com.example.demo.model.dto.GuanZhuDTO;
import com.example.demo.service.TiLikeService;
import com.example.demo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/11/09.
 */
@Service
@Transactional
public class TiLikeServiceImpl extends AbstractService<TiLike> implements TiLikeService {
    @Resource
    private TiLikeMapper tiLikeMapper;

    @Override
    public Result getTiLike(GuanZhuDTO guanZhuDTO) {
        TiLike tiLike = new TiLike();
        tiLike = tiLikeMapper.match(guanZhuDTO.getOne(),guanZhuDTO.getTwo());
        if(tiLike==null){
            return new Result(0,"lala");
        }else {
            return new Result(0,"lala","不为空");
        }
    }

    @Override
    public int deleteTiLike(GuanZhuDTO guanZhuDTO) {
        TiLike tiLike = new TiLike();
        tiLike = tiLikeMapper.match(guanZhuDTO.getOne(),guanZhuDTO.getTwo());
        int n = tiLikeMapper.deleteByIds(String.valueOf(tiLike.getId()));
        return n;
    }
}
