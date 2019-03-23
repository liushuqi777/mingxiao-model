package com.platform.parent.util;

import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 * Created with IDEA
 * author: lsq
 * Date:2019/03/10
 * Time:16:12
 */
public class FormatUtil {


    /**
     * NumberFormat is the abstract base class for all number formats.
     * This class provides the interface for formatting and parsing numbers.
     * @param d
     * @return
     */
    public static String formatDouble3(Double d) {
        NumberFormat nf = NumberFormat.getNumberInstance();


        // 保留两位小数
        nf.setMaximumFractionDigits(4);


        // 如果不需要四舍五入，可以使用RoundingMode.DOWN
        nf.setRoundingMode(RoundingMode.UP);


        return nf.format(d);
    }

}
