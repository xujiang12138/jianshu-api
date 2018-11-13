package com.example.demo.model.vo;

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
public class FanVo {
    private Integer author_id ;
    private String avatar;
}
