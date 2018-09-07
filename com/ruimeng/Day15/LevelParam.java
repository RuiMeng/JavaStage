/**
 * 这样记录数据比将数据放到工作的类中更节约内存。
 */

package com.ruimeng.Day15;

public class LevelParam {

    public final static Level[] level = new Level[6];

    static {
        level[0] =new Level(1, 2, 2, 5, 1);
        level[1] =new Level(2, 4, 3, 10, 2);
        level[2] =new Level(3, 6, 4, 15, 3);
        level[3] =new Level(4, 8, 5, 20, 4);
        level[4] =new Level(5, 10, 6, 25, 5);
        level[5] =new Level(6, 12, 7, 30, 6);
    }
}
