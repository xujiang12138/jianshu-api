package com.example.demo.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import javax.persistence.*;

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Integer articleId;

    private Integer comments;

    private Integer likes;

    private String summary;

    private String thumbnail;

    private String title;

    @Column(name = "write_time")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date writeTime;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "button_id")
    private Integer buttonId;

    /**
     * @return article_id
     * @param id
     */
    public Integer getArticleId(Integer id) {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * @return comments
     */
    public Integer getComments() {
        return comments;
    }

    /**
     * @param comments
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * @return likes
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * @param likes
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return write_time
     */
    public Date getWriteTime() {
        return writeTime;
    }

    /**
     * @param writeTime
     */
    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
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

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", comments=" + comments +
                ", likes=" + likes +
                ", summary='" + summary + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", title='" + title + '\'' +
                ", writeTime=" + writeTime +
                ", userId=" + userId +
                ", buttonId=" + buttonId +
                '}';
    }
}