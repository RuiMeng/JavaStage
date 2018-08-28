package com.ruimeng.Day11;

import java.util.Scanner;

public class FahrenheitCentigrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入当前的华氏温度：");
        float fahrenheitValue = sc.nextFloat();
        float celsiusValue = ((fahrenheitValue - 32)*5)/9;
        System.out.println(String.format("当前的摄氏温度为: %.2f", celsiusValue));
    }
}
