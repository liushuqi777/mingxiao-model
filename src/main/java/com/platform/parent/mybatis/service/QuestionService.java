package com.platform.parent.mybatis.service;

/**
 * Created with IDEA
 * author: lsq
 * Date:2019/03/10
 * Time:14:44
 */
public interface QuestionService {
    /**
     * 查询错误题目数量
     *
     * @param userId
     * @return
     */
    Integer getErrorCount(Integer userId);


}
