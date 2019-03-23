package com.platform.parent.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 * author: lsq
 * Date:2019/03/10
 * Time:15:15
 */
@Mapper
@Component
public interface QuestionMapper {

    Integer getErrorCount(@Param(value = "userId")Integer userId);

}
