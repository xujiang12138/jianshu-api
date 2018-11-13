package com.example.demo.model;

import javax.persistence.*;

@Table(name = "ti_like")
public class TiLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "button_id")
    private Integer buttonId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return button_id
     */
    public Integer getButtonId() {
        return buttonId;
    }

    /**
     * @param buttonId
     */
    public void setButtonId(Integer buttonId) {
        this.buttonId = buttonId;
    }
}