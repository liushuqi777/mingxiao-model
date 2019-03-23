package com.platform.parent.controller;

import com.alibaba.fastjson.JSONObject;
import com.platform.parent.mybatis.service.QuestionService;
import com.platform.parent.request.question.QuestionRequest;
import com.platform.parent.util.EnumUtil;
import com.platform.parent.util.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lsq.
 */
@RestController
@RequestMapping(value = "/question")
public class QuestionController {
    private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);

    @Autowired
    private QuestionService questionService;

    /**
     * 查询错误题目数量
     * 详情见文档
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/error/count/get", method = RequestMethod.POST)
    public @ResponseBody
    Object errorCountGet(@RequestBody QuestionRequest request) {
        if (request == null || request.getUserId() == null || request.getUserId() < 1
                ) {
            return EnumUtil.errorToJson(ErrorCode.ILLEGAL_REQUEST_PARAM);
        }
        JSONObject result = new JSONObject();
        Integer count = questionService.getErrorCount(request.getUserId());
        result.put("status", 0);
        result.put("message", "成功");
        result.put("data", count);

        return result;
    }

}
