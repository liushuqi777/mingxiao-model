package com.platform.parent.response.question;

/**
 * Created with IDEA
 * author: lsq
 * Date:2019/03/12
 * Time:23:01
 */
public class QuestionResultResponse {
    private String questionNo;
    private Integer userId;
    private Integer trueCount;
    private Integer count;//题目总数
    private Long interval;//做题时间
    private String timeRate;//花费时间打败学生数目
    private String trueRate;//正确率打败学生数量
    private String trueQuestionRate; // 正确率
    private String pingfen;// B+ A  评分
    private Integer trueGold;
    private Integer fullGold;
    private Integer hardGold;
    private Integer nowGold;
    private Integer trueJifen;
    private Integer fullJifen;
    private Integer hardJifen;
    private Integer nowJifen;
    private Integer timeFlag;//测验标志 0:否,1:是
    private Integer level;
    private Integer isUp; // 0:否,1:是
    private Integer nextLevelCount;

    public Integer getIsUp() {
        return isUp;
    }

    public void setIsUp(Integer isUp) {
        this.isUp = isUp;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTrueCount() {
        return trueCount;
    }

    public void setTrueCount(Integer trueCount) {
        this.trueCount = trueCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public String getTimeRate() {
        return timeRate;
    }

    public void setTimeRate(String timeRate) {
        this.timeRate = timeRate;
    }

    public String getTrueRate() {
        return trueRate;
    }

    public void setTrueRate(String trueRate) {
        this.trueRate = trueRate;
    }

    public String getTrueQuestionRate() {
        return trueQuestionRate;
    }

    public void setTrueQuestionRate(String trueQuestionRate) {
        this.trueQuestionRate = trueQuestionRate;
    }

    public String getPingfen() {
        return pingfen;
    }

    public void setPingfen(String pingfen) {
        this.pingfen = pingfen;
    }

    public Integer getTrueGold() {
        return trueGold;
    }

    public void setTrueGold(Integer trueGold) {
        this.trueGold = trueGold;
    }

    public Integer getFullGold() {
        return fullGold;
    }

    public void setFullGold(Integer fullGold) {
        this.fullGold = fullGold;
    }

    public Integer getHardGold() {
        return hardGold;
    }

    public void setHardGold(Integer hardGold) {
        this.hardGold = hardGold;
    }

    public Integer getNowGold() {
        return nowGold;
    }

    public void setNowGold(Integer nowGold) {
        this.nowGold = nowGold;
    }

    public Integer getTrueJifen() {
        return trueJifen;
    }

    public void setTrueJifen(Integer trueJifen) {
        this.trueJifen = trueJifen;
    }

    public Integer getFullJifen() {
        return fullJifen;
    }

    public void setFullJifen(Integer fullJifen) {
        this.fullJifen = fullJifen;
    }

    public Integer getHardJifen() {
        return hardJifen;
    }

    public void setHardJifen(Integer hardJifen) {
        this.hardJifen = hardJifen;
    }

    public Integer getNowJifen() {
        return nowJifen;
    }

    public void setNowJifen(Integer nowJifen) {
        this.nowJifen = nowJifen;
    }

    public Integer getTimeFlag() {
        return timeFlag;
    }

    public void setTimeFlag(Integer timeFlag) {
        this.timeFlag = timeFlag;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getNextLevelCount() {
        return nextLevelCount;
    }

    public void setNextLevelCount(Integer nextLevelCount) {
        this.nextLevelCount = nextLevelCount;
    }
}
