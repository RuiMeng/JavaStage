package com.ruimeng.Day11;

import java.util.Scanner;

public class TempDebug {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请从键盘输入：");
        int inputInt = input.nextInt();
        System.out.println(inputInt == 1 ? "ruimeng" : "ruixue");
        System.out.print("请从键盘输入：");
        String inputString = input.next();

        System.out.println("键盘的输入为：" + inputString);
    }
}
