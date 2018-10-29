package com.example.demo.model;

import javax.persistence.*;

public class Button {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "article_count")
    private Integer articleCount;

    private String creator;

    private String description;

    private Integer fans;

    private String picture;

    private String summary;

    @Column(name = "topic_name")
    private String topicName;

    @Column(name = "topic_url")
    private String topicUrl;

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
     * @return article_count
     */
    public Integer getArticleCount() {
        return articleCount;
    }

    /**
     * @param articleCount
     */
    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return fans
     */
    public Integer getFans() {
        return fans;
    }

    /**
     * @param fans
     */
    public void setFans(Integer fans) {
        this.fans = fans;
    }

    /**
     * @return picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
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
     * @return topic_name
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * @param topicName
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * @return topic_url
     */
    public String getTopicUrl() {
        return topicUrl;
    }

    /**
     * @param topicUrl
     */
    public void setTopicUrl(String topicUrl) {
        this.topicUrl = topicUrl;
    }
}