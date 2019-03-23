package com.platform.parent.mybatis.dto;

/**
 * Created with IDEA
 * author: lsq
 * Date:2019/01/13
 * Time:17:46
 */
public class CourseWareDto {
    private Integer id;
    private String subject;
    private String grade;
    private String teaching;
    private String topic;
    private String diff;
    private String title;
    private String content;
    private Integer consumeCount;
    private Double systemScore;
    private String userName;
    private String knowledgecode;

    public String getKnowledgecode() {
        return knowledgecode;
    }

    public void setKnowledgecode(String knowledgecode) {
        this.knowledgecode = knowledgecode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeaching() {
        return teaching;
    }

    public void setTeaching(String teaching) {
        this.teaching = teaching;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getConsumeCount() {
        return consumeCount;
    }

    public void setConsumeCount(Integer consumeCount) {
        this.consumeCount = consumeCount;
    }

    public Double getSystemScore() {
        return systemScore;
    }

    public void setSystemScore(Double systemScore) {
        this.systemScore = systemScore;
    }
}
