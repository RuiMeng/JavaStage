package com.ruimeng;

import com.ruimeng.Day09.PrintGoodsInfo;
import com.ruimeng.Day09.PrintPrivateInfo;
import com.ruimeng.Day10.PhoneInfo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Start Java!!!");

        PrintGoodsInfo.show();
        System.out.println();
        PrintPrivateInfo.show();
        System.out.println();

        PrintGoodsInfo.main(null);
        System.out.println();
        PrintPrivateInfo.main(null);
        System.out.println();

        PhoneInfo phoneInfo = new PhoneInfo("iPhone7", 390, 32, 4799);
        phoneInfo.show();

        com.ruimeng.Day12.DebugCode dc = new com.ruimeng.Day12.DebugCode();
        dc.show();
    }
}
