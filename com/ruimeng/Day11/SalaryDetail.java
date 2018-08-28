/**
 * @author RuiMeng
 * @date 180828
 *
 * @checkPoint
 * 格式化的输出方法为：System.out.println(String.format("",变量));
 *
 *
 * 浮点型格式化输出的时候控制小数位数的方法如下。
 *   %-m.nf:替换的是浮点型
 * 	 说明:-左对齐
 * 	      m整个数据的长度
 * 	      n:这和数据中小数的站位
 * 	      当实际长度大于预设长度的时候以实际长度为准
 * 	      当实际长度小于预设长度的时候一预设长度为准可以使用-作为左对齐
 *
 */

package com.ruimeng.Day11;

import java.util.Scanner;

public class SalaryDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您本月的基本工资：");
        float employeeSalary = sc.nextFloat();
        System.out.println("该员工的薪资明细如下：");
        System.out.println(String.format("基本工资为 -- %.2f", employeeSalary));
        System.out.println(String.format("物价津贴为 -- %.2f", (employeeSalary * 0.4)));
        System.out.println(String.format("房租津贴为 -- %.2f", (employeeSalary * 0.25)));
        System.out.println(String.format("最终工资总计为 -- %.2f", (employeeSalary * 1.65)));
    }
}
