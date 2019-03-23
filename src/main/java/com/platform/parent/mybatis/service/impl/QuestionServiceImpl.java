package com.platform.parent.mybatis.service.impl;

import com.platform.parent.mybatis.dao.QuestionMapper;
import com.platform.parent.mybatis.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IDEA
 * author: lsq
 * Date:2019/03/10
 * Time:14:44
 */
@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;


    @Override
    public Integer getErrorCount(Integer userId) {
        return questionMapper.getErrorCount(userId);
    }
}
