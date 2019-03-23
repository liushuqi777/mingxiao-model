package com.platform.parent.response.question;

/**
 * Created with IDEA
 * author: lsq
 * Date:2019/03/10
 * Time:14:49
 */
public class QuestionResponse {
    private Integer wareId;

    private Integer type;//1:题目,2:片段

    private String questionNo;

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public Integer getWareId() {
        return wareId;
    }

    public void setWareId(Integer wareId) {
        this.wareId = wareId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
