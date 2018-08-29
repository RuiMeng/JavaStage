/**
 * @author RuiMeng
 * @date 20180829
 *
 * @CheckPoint
 *
 * -- java.util.Arrays;
 *    com.sun.deploy.util.ArrayUtil;
 *    这两个包要区分一下，有点相似但是功用不同。
 *
 * -- (int)(Math.random() * 100);
 *    在取随机整数的时候这里有一个暗坑，会让计算值永为 0。这个暗坑貌似在 python 也存在。
 *
 * -- 多维数组声明，定义，赋值。
 *    int[][] nums = new int[5][]; 会抛出空指针异常。
 *
 *
 */

package com.ruimeng.Day12;

import java.util.Arrays;

public class SortNums {

    public static void main(String[] args) {

        int[][] nums = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        System.out.println("排序前数组为：");
        for (int i = 0; i < 5; i++) {
            for (int j : nums[i]) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        System.out.println("\n排序后数组为：");
        for (int i = 0; i < 5; i++) {
            Arrays.sort(nums[i]);
            for (int j : nums[i]) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
