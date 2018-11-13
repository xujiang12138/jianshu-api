package com.example.demo.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Created by xuj on 2018/11/9.
 */
@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class EssayVo {
    private Date commentTime ;
    private String content ;
    private String avatar ;
    private String nickName ;

    public EssayVo() {
    }
}
