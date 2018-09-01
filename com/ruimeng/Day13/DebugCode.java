package com.ruimeng.Day13;

import java.util.Scanner;

public class DebugCode {
    /**
     * 这个是注释1？
     *
     */

    public static void main(String[] args) {

        System.out.println("Day13 DebugCode");

        DebugCode.rewardMainFlow();

    }

    public static void rewardMainFlow() {

        Scanner sc = new Scanner(System.in);
        RewardServiceSystem rwService = new RewardServiceSystem();
        do{
            RewardServiceSystem.mainMenuShow();
            System.out.print("请选择：");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("奖客富翁系统〉〉〉〉〉〉注册");
                    rwService.RegisterService();
                    break;
                case 2:
                    System.out.println("奖客富翁系统〉〉〉〉〉〉登录");
                    rwService.loginService();
                    break;
                case 3:
                    System.out.println("奖客富翁系统〉〉〉〉〉〉抽奖");
                    rwService.luckDrawService();
                    break;
                case 4:
                    System.out.println("奖客富翁系统〉〉〉〉〉〉打印所有用户信息");
                    rwService.displayUserInfo();
                    break;
            }

            System.out.print("是否继续（n/y）：");
        } while (!"n".equals(sc.next()));
        System.out.println("程序结束！");
    }
}
