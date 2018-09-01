/**
 *
 * 使用对象的时候，不小心让创建对象的语句多次执行了。
 *
 */

package com.ruimeng.Day13;

import java.util.Scanner;

/**
 * 奖客服务系统
 */
public class RewardServiceSystem {

    /**
     *
     * 同一个用户的 usersName 和 usersPassword 在数组中的 index 相等。
     *
     */
    private String[] usersName = new String[10];
    private String[] usersPassword = new String[10];
    private int[] usersId = new int[10];
    private int currentUserId;
    private int userNum = 0;
    private boolean loginState = false;

    public static void mainMenuShow() {
        String mainMenu = "*********************欢迎进入奖客富翁系统**********************\n" +
                "\t\t\t\t\t\t1.注册\n" +
                "\t\t\t\t\t\t2.登录\n" +
                "\t\t\t\t\t\t3.抽奖\n" +
                "\t\t\t\t\t\t4.显示\n" +
                "*************************************************************\n";

        System.out.print(mainMenu);
    }

    public void RegisterService() {

        Scanner sc = new Scanner(System.in);

        do {

            if (userNum >= 9 ) {
                System.out.println("用户数达到上限，不能继续添加新用户。");
                break;
            }

            System.out.print("请输入用户名：");
            usersName[userNum] = sc.next();
            System.out.print("请输入用户密码：");
            usersPassword[userNum] = sc.next();
            usersId[userNum] = (int)((Math.random()*9+1)*1000);
            System.out.println("用户名：" + usersName[userNum] + "；用户密码：" +
                    usersPassword[userNum] + "；会员号：" + usersId[userNum]);

            userNum++;

            System.out.print("是否继续添加用户(n/y):");
        } while ("y".equals(sc.next()));
    }

    public boolean loginService() {

        if (0 == userNum) {
            System.out.println("请先去注册！");
            return false;
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名：");
            String usersNameInput = sc.next();
            System.out.print("请输入密码：");
            String userPasswordInput = sc.next();

            for (int j = 0; j < 10; j++) {
                if (usersNameInput.equals(usersName[j]) && userPasswordInput.equals(usersPassword[j])) {
                    loginState = true;
                    currentUserId = usersId[j];
                    break;
                }
            }

            if (loginState) {
                System.out.println("登录成功！欢迎 " + usersNameInput);
                break;
            } else {
                if (i != 2) {
                    System.out.println("输入错误你还有2次机会！，剩余 " + (2 - i) +" 次机会。请重新输入。");
                } else {
                    System.out.println("您已输入错误 3 次密码，登录失败。");
                }
            }
        }

        return loginState;
    }

    public boolean displayUserInfo() {

        if (0 == userNum) {
            System.out.println("请先去注册！");
            return false;
        }

        int i = 0;
        while (null != usersName[i])
        {
            System.out.println("用户名：" + usersName[i] +
                    "；密码" + usersPassword[i] +
                    "；会员号" + usersId[i]);
            i++;
        }
        return true;
    }

    public boolean luckDrawService() {

        if (!loginState) {
            System.out.println("请先登录!");
            return false;
        }

        boolean drawState = false;

        System.out.println("登录会员的会员卡号：" + currentUserId);
        System.out.print("幸运的数字:");
        for (int i = 0; i < 4; i++)
        {
            int luckNum = (int)((Math.random()*9+1)*1000);
            System.out.print(" " + luckNum );
            if (luckNum == currentUserId) {
                drawState = true;
            }
        }
        System.out.println();

        if (drawState) {
            System.out.println("恭喜您，今天是您的幸运日，您中奖了！");
        } else {
            System.out.println("糟糕，今天不是您的幸运日！");
        }

        return drawState;
    }
}
