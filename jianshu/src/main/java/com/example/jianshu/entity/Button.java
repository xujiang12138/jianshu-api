package com.example.jianshu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by xuj on 2018/10/22.
 */
@Entity
@Data
@Builder
public class Button {
    @Id
    @GeneratedValue
    private Integer id;
    private String topicname;
    private String topicurl ;
    private String summary ;
    private Integer articlecount;
    private Integer fans;
    private String description;
    private String creator;
    private String picture;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "Button_id")
    private Set<ButtonArticle> articles = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "Fans_id")
    private Set<ButtonFans> fansList = new HashSet<>();


}
