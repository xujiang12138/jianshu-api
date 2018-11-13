package com.example.demo.model.vo;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by xuj on 2018/11/5.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HotVo {
    private Integer id;
    private String avatar ;
    private String nick_name;
    private Integer like_count;
    private Integer words_count ;
}
