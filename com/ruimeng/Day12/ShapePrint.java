package com.ruimeng.Day12;

import java.util.Scanner;

public class ShapePrint {

    private void rightTriangle() {

        System.out.println("\n打印直角三角形。");
        for (int i = 0; i < 5; i++) {
            char charUsed = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(charUsed);
                charUsed += 1;
            }
            System.out.println();
        }
    }

    private void diamond() {
        /**
         * 菱形的行(主要控制变量): line
         * 菱形的行数: lines
         * 菱形列数: cols
         * 菱形的中心行为: midLine = (lines + 1) / 2
         *
         * 上半部分每行的列数: col = midLine - 1 + line
         * 上半部分每行的字符数: charNum = (2 * (line - 1)) + 1
         * 上半部分每行的空格数: col - charNum = ((midLine - 1 + line) - ((2 * (line - 1)) + 1)
         */
        System.out.println("\n打印菱形。");
        System.out.print("请输入菱形的行数：");
        Scanner sc = new Scanner(System.in);
        int shapeLines = sc.nextInt();
        int diamondControl = (shapeLines + 1) / 2;

        //打印菱形的上半部分
        for (int i = 1; i <= diamondControl; i++) {
            //打印每行前面的空格部分
            for (int j = 0; j < ((diamondControl - 1 + i) - ((2 * (i - 1)) + 1)); j++) {
                System.out.print(" ");
            }
            //打印每行后面的字符部分
            char charUsed = 'A';
            for (int j = 0; j < (2 * (i - 1)) + 1; j++) {
                System.out.print(charUsed);
                charUsed += 1;
            }
            System.out.println();
        }

        //打印菱形的下半部分
        for (int i = diamondControl - 1; i >= 1; i--) {
            //打印每行前面的空格部分
            for (int j = 0; j < ((diamondControl - 1 + i) - ((2 * (i - 1)) + 1)); j++) {
                System.out.print(" ");
            }
            //打印每行后面的字符部分
            char charUsed = 'A';
            for (int j = 0; j < (2 * (i - 1)) + 1; j++) {
                System.out.print(charUsed);
                charUsed += 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("打印字母组成的图形。");
        ShapePrint shPrt = new ShapePrint();
        shPrt.rightTriangle();
        shPrt.diamond();
    }
}
