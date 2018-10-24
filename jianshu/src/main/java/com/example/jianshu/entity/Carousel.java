package com.example.jianshu.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xuj on 2018/10/22.
 */
@Entity
@Data
@Builder
public class Carousel {
    @Id
    @GeneratedValue
    private Integer id;
    private String url ;
}
