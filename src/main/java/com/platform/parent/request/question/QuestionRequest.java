package com.platform.parent.request.question;

import java.util.List;
import java.util.Set;

/**
 * Created with IDEA
 * author: lsq
 * Date:2019/03/10
 * Time:14:38
 */
public class QuestionRequest {
    private Integer userId;
    private String gradeCode;
    private String subjectCode;
    private String teachingCode;
    private List<Integer> weeks;
    private Integer sort;//当前是第几题,默认是1
    private Set<String> set;
    private Integer now;
    private Integer type;//1:普通,2:测验,3:错题

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getNow() {
        return now;
    }

    public void setNow(Integer now) {
        this.now = now;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getTeachingCode() {
        return teachingCode;
    }

    public void setTeachingCode(String teachingCode) {
        this.teachingCode = teachingCode;
    }

    public List<Integer> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<Integer> weeks) {
        this.weeks = weeks;
    }
}
