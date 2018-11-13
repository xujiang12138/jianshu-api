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
public class ButtonArticleVo {
    private Integer article_id;
    private String title ;
    private String thumbnail ;
    private String summary ;
    private String nick_name ;
    private Integer likes ;
    private Integer comments ;
}
