package com.example.demo.model;

import javax.persistence.*;

@Table(name = "button_fans")
public class ButtonFans {
    @Id
    @Column(name = "author_id")
    private Integer authorId;

    private String avatar;

    @Column(name = "Fans_id")
    private Integer fansId;

    /**
     * @return author_id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * @param authorId
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return Fans_id
     */
    public Integer getFansId() {
        return fansId;
    }

    /**
     * @param fansId
     */
    public void setFansId(Integer fansId) {
        this.fansId = fansId;
    }
}