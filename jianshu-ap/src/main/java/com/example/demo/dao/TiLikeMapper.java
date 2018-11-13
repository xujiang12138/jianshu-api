package com.example.demo.dao;

import com.example.demo.core.Mapper;
import com.example.demo.model.TiLike;
import com.example.demo.model.dto.GuanZhuDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface TiLikeMapper extends Mapper<TiLike> {
    @Select("SELECT * FROM ti_like t WHERE t.user_id =#{one} AND t.button_id =#{two} ")
    TiLike match(@Param("one") Integer one , @Param("two") Integer two);

}