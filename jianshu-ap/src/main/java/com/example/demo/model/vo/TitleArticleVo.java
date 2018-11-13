package com.example.demo.model.vo;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Created by xuj on 2018/11/7.
 */
@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class TitleArticleVo {
    private Integer articleId;
    private Integer comments ;
    private Integer likes ;
    private String summary ;
    private String thumbnail;
    private String title ;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date writeTime;
    private String nickName ;

    public TitleArticleVo() {
    }
}
