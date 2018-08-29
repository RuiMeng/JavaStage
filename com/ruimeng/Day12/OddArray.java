/**
 * @author RuiMeng
 * @date 20180829
 *
 * @CheckPiont
 *
 * java.util.Arrays 的使用还需要继续熟悉。
 *
 */

package com.ruimeng.Day12;

public class OddArray {

    public static void main(String[] args) {

        int[] odd = new int[50];
        for (int i = 0; i <= 99; i++) {
            if (i%2 == 1) {
                odd[(i+1)/2 - 1] = i;
            }
        }

        for (int i : odd) {
            System.out.print(i + "\t");
            if (((i + 1)/2)%10 == 0) {
                System.out.println();
            }
        }
    }
}
