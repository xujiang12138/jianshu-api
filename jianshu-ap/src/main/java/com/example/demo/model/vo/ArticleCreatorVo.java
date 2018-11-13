package com.example.demo.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by xuj on 2018/11/9.
 */
@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
public class ArticleCreatorVo {
    private String avatar ;
    private String nickName ;
    private Integer lickCount ;
    private Integer wordCount ;
}
