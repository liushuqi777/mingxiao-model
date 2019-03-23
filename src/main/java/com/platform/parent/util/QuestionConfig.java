package com.platform.parent.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author: lsq
 * Date:2019/03/10
 * Time:16:20
 */
public class QuestionConfig {

    //一次推送的题目数量
    public static final int questionCount = 30;
    //等级积分
    public static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    static
    {
        map = new HashMap<Integer, Integer>();
        map.put(1, 10000);
        map.put(2, 20000);
        map.put(3, 40000);
        map.put(4, 60000);
        map.put(5, 999999);
    }

    //正确题目得分
    public static final int truePoint = 100;
    //满分奖励
    public static final int fullPoint = 1500;
    //五星难题
    public static final int hard5Point = 200;
    //六星难题
    public static final int hard6Point = 500;

    //正确题目得分
    public static final int trueGold = 100;
    //满分奖励
    public static final int fullGold = 1500;
    //五星难题
    public static final int hard5Gold = 200;
    //六星难题
    public static final int hard6Gold = 500;

}
