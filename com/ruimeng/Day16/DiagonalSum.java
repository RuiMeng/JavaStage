package com.ruimeng.Day16;

public class DiagonalSum {

    public static int diagonalSum() {

        int[][] sArray = new int[3][3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sArray[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sArray[i][j] +"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum += sArray[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(DiagonalSum.diagonalSum());
    }
}
