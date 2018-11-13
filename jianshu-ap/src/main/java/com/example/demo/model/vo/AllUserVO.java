package com.example.demo.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by xuj on 2018/11/6.
 */
@Data
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class AllUserVO {
    private Integer id ;
    private String avatar ;
    private String description;
    private String nick_name ;
    private String articleOne;
    private String articleTwo;
    private String articleThree;

    public AllUserVO() {
    }
}
