package com.platform.parent.util;


import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created By lsq
 */
public class VDateTimeUtil {

    /**
     * 禁止初始化
     */
    private VDateTimeUtil() {
    }

    /**
     * 返回预设Format的当前日期字符串
     *
     * @return 预设Format的当前日期字符串
     * @see
     */
    public static String getToday() {
        Date today = new Date();
        return format(today);
    }

    /**
     * 使用预设Format格式化Date成字符串
     *
     * @param date 输入日期
     * @return 预设Format的日期字符串
     */
    public static String format(Date date) {
        return format(date, "yyyy-MM-dd");
    }

    /**
     * 使用参数Format格式化Date成字符串
     *
     * @param date    输入日期
     * @param pattern Format格式
     * @return Format的日期字符串
     */
    public static String format(Date date, String pattern) {
        return date == null ? "" : new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 使用预设格式将字符串转为Date
     *
     * @param strDate 輸入字符串
     * @return date 预设Format的日期
     */
    public static Date parse(String strDate) {
        return parse(strDate, "yyyy-MM-dd");
    }

    /**
     * 使用参数Format将字符串转为Date
     *
     * @param strDate 輸入字符串
     * @param pattern format格式
     * @return 预设Format的日期
     */
    public static Date parse(String strDate, String pattern) {
        try {
            return StringUtils.isEmpty(strDate) ? null : new SimpleDateFormat(pattern).parse(strDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 在日期上增加数个整月
     *
     * @param date 輸入日期
     * @param n    月數
     * @return date 结果日期
     */
    public static Date addMonth(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }

    /**
     * 在日期上增加数个整天
     *
     * @param date 輸入日期
     * @param n    天数
     * @return 结果日期
     */
    public static Date addDay(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, n);
        return cal.getTime();
    }

    /**
     * 在日期上增加数个小时
     *
     * @param date 輸入日期
     * @param n    小時数
     * @return 结果日期
     */
    public static Date addHour(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, n);
        return cal.getTime();
    }

    /**
     * 在日期上增加数个分钟
     *
     * @param date 输入日期
     * @param n    分钟数
     * @return 结果日期
     */
    public static Date addMinute(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, n);
        return cal.getTime();
    }

    /**
     * 得到两个日期时间的差额
     *
     * @param date      被减数
     * @param otherDate 减数
     * @return 时间差(毫秒)
     */
    public static long betDate(Date date, Date otherDate) {
        return date.getTime() - otherDate.getTime();
    }

    /**
     * 以年，月，日来构造一个日期对象
     *
     * @param year  年份
     * @param month 月份
     * @param day   天份
     * @return 结果日期
     */
    public static Date makeDate(int year, int month, int day) {
        return makeDate(year, month, day, 0, 0, 0);
    }

    /**
     * 以年，月，日，小时，分钟，秒来构造一个日期对象
     *
     * @param year   年份
     * @param month  月份
     * @param day    天份
     * @param hour   小时
     * @param minute 分钟
     * @param second 秒
     * @return 结果日期
     */
    public static Date makeDate(int year, int month, int day, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 返回指定日期是哪一月
     *
     * @param date 输入日期
     * @return 月份
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 返回指定日期是哪一年
     *
     * @param date 输入日期
     * @return 年份
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 返回指定日期是哪一天
     *
     * @param date 输入日期
     * @return 天份
     */
    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 返回指定日期是周几
     *
     * @param date 输入日期
     * @return 周几
     */
    public static int getWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        if (week == 1) {
            return 7;
        } else {
            return week - 1;
        }

    }

    /**
     * 返回指定日期是几点
     *
     * @param date 输入日期
     * @return 小时
     */
    public static int getHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 返回指定日期是几分钟
     *
     * @param date 输入日期
     * @return 分钟
     */
    public static int getMinute(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MINUTE);
    }

    /**
     * 返回指定日期是几分钟
     *
     * @param date 输入日期
     * @return 秒
     */
    public static int getSecond(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.SECOND);
    }

    /**
     * 获得更定日期所在月的最后一天,可能29,30,31,28等
     *
     * @param date 输入日期
     * @return 所在月的最后一天
     */
    public static Date getLastDateOfMonth(Date date) {
        int year = getYear(date);
        int month = getMonth(date);

        int hour = getHour(date);
        int minute = getMinute(date);
        int second = getSecond(date);

        return addDay(addMonth(makeDate(year, month, 1, hour, minute, second), 1), -1);

    }

    /**
     * 获得指定日期所在月的的第一天,时分秒同date相同
     *
     * @param date 输入日期
     * @return 所在月的的第一天
     */
    public static Date getFirstDateOfMonth(Date date) {
        int year = getYear(date);
        int month = getMonth(date);
        int hour = getHour(date);
        int minute = getMinute(date);
        int second = getSecond(date);
        return makeDate(year, month, 1, hour, minute, second);
    }

    /**
     * 获得指定日期所在月的的第一天,时分秒: 00:00:00
     *
     * @param date 输入日期
     * @return 所在月的的第一天
     */
    public static Date getFirstTimeOfMonth(Date date) {
        int year = getYear(date);
        int month = getMonth(date);
        return makeDate(year, month, 1, 0, 0, 0);
    }

    /**
     * 先得到指定日期所在周,再得到当周指定周几的日期,resultWeek用于指定周几,取值范围1-7
     *
     * @param date       输入日期
     * @param resultWeek 周几
     * @return resultWeek的结果日期
     */
    public static Date getDayOfWeek(Date date, int resultWeek) {
        if (resultWeek < 1 || resultWeek > 7) {
            throw new IllegalArgumentException("resultWeek must in 1-7");
        }
        int week = getWeek(date);
        return addDay(date, resultWeek - week);
    }

    /**
     * 得到以当前时间为基数的序列
     *
     * @return 当前日期yyyyMMddHHmmssS毫秒
     */
    public static Long getTime() {
        Long result = new Long(format(new Date(), "yyyyMMddHHmmssS"));
        return result;
    }

    /**
     * 返回当前Date的java.sql.Date转型类
     *
     * @return 日期
     */
    public static java.sql.Date getSqlDate() {
        return getSqlDate(new Date());
    }

    /**
     * 返回Date的java.sql.Date转型类
     *
     * @param date 输入日期
     * @return 日期
     */
    public static java.sql.Date getSqlDate(Date date) {
        Date target = makeDate(getYear(date), getMonth(date), getDay(date));
        return new java.sql.Date(target.getTime());
    }

    /**
     * 返回Date的java.sql.Date转型类
     *
     * @param time 输入时间戳
     * @return 日期
     */
    public static java.sql.Date getSqlDate(Long time) {
        return getSqlDate(new Date(time));
    }

    /**
     * 返回当前Date的java.sql.Timestamp转型类
     *
     * @return 时间
     */
    public static java.sql.Timestamp getSqlTimestamp() {
        return getSqlTimestamp(new Date());
    }

    /**
     * 返回Date的java.sql.Timestamp转型类
     *
     * @param date 输入日期
     * @return 时间
     */
    public static java.sql.Timestamp getSqlTimestamp(Date date) {
        return new java.sql.Timestamp(date.getTime());
    }

    /**
     * 返回Date的java.sql.Timestamp转型类
     *
     * @param time 时间戳
     * @return 时间
     */
    public static java.sql.Timestamp getSqlTimestamp(Long time) {
        return new java.sql.Timestamp(time);
    }

    /**
     * 返回当前日期是第几周
     *
     * @return
     */
    public static int getWeekCount(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);//设置星期一为一周开始的第一天
        calendar.setTimeInMillis(date.getTime());//获得当前的时间戳
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);//获得当前日期属于今年的第几周
        return weekOfYear;
    }

}
