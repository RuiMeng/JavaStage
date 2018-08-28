/**
 * @author RuiMeng
 * @date 180828
 *
 * @checkPoint
 * -- java char 类型数字转换为 int 类型是按照 ascii 转换的。
 * -- java String 类型是不能转换为 int 类型的。
 * -- python 中的字符串类型数字是按照数字表示的数值来转换的。
 *
 */


package com.ruimeng.Day11;

import java.util.Scanner;

public class UserIdSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的用户 ID：");
        String userId = sc.next();
        int userIdSum = 0;
        for (int i = 0; i < userId.length(); i++) {
            userIdSum += ((int)userId.charAt(i) - 48);
        }
        System.out.println("您的会员 ID 各位数字之和为：" + userIdSum);
    }
}
