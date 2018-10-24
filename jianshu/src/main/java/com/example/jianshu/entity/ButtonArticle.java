package com.example.jianshu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xuj on 2018/10/22.
 */
@Entity
@Data
@Builder
public class ButtonArticle {
    @Id
    @GeneratedValue
    private Integer id ;
    private String title;
    private String summary;
    private  String  thumbnail;
    private Integer authorId ;
    private String nickName ;
    private Integer comments ;
    private Integer likes;




}
