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
public class ButtonFans {
    @Id
    @GeneratedValue
    private Integer authorId;
    private String avatar ;


}
