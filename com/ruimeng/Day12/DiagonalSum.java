package com.ruimeng.Day12;

public class DiagonalSum {
    public static void main(String[] args) {

        // 矩阵初始化
        int[][] nums = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        // 矩阵输出
        System.out.println("矩阵为：");
        for (int i = 0; i < 3; i++) {
            for (int j : nums[i]) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        // 对角线和计算
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum += nums[i][j];
                }
            }
        }
        System.out.println("矩阵对角线上的和为：" + sum);
    }
}
