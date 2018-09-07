/**
 *
 * Java 日期操作
 *
 */

package com.ruimeng.Day16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeFormatPrint {

    public static String curTimeFormatPrint() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(d);
    }

    public static int weekNoInYear() {

        Calendar c = Calendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf.format(c.getTime()));

        c.set(Calendar.YEAR, 2017);
        c.set(Calendar.MONTH, 3);
        c.set(Calendar.DAY_OF_MONTH, 6);
//        System.out.println(sdf.format(c.getTime()));

        return c.get(Calendar.WEEK_OF_YEAR);
    }

    public static void main(String[] args) {

        System.out.print("格式化输出当前的日期：");
        System.out.println(TimeFormatPrint.curTimeFormatPrint());

        System.out.print("2017-04-06 是该年的第几周：");
        System.out.println(TimeFormatPrint.weekNoInYear());
    }
}
