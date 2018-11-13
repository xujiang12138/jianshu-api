package com.example.demo.service;
import com.example.demo.core.Result;
import com.example.demo.model.TiLike;
import com.example.demo.core.Service;
import com.example.demo.model.dto.GuanZhuDTO;


/**
 * Created by taoranran on 2018/11/09.
 */
public interface TiLikeService extends Service<TiLike> {
        Result getTiLike(GuanZhuDTO guanZhuDTO);
        int deleteTiLike(GuanZhuDTO guanZhuDTO);

}
