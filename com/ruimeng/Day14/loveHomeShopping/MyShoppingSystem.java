package com.ruimeng.Day14.loveHomeShopping;

import java.util.Scanner;

public class MyShoppingSystem {

    /**
     * InterfaceStack[0] 是从来没有用的栈底。
     */
    private MyShoppingManager manager;
    private String[] InterfaceStack = new String[10];
    private int InterfaceStackInd = 0;
    private MyShoppingMenus menus = new MyShoppingMenus();

    public MyShoppingSystem(MyShoppingManager manager) {
        this.manager = manager;
    }

    /**
     * 用户名、用户密码验证
     * @return 如果验证成功，返回 true。
     */
    public boolean StartSMS () {

        boolean confirmState = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入用户名：");
        String userNameInput = sc.next();
        System.out.print("请输入用户密码：");
        String passWordInput = sc.next();

        System.out.println(manager.getPassWord()+manager.getPassWord());

        if (manager.getPassWord().equals(passWordInput) && manager.getUserName().equals(userNameInput)) {
            confirmState = true;
            System.out.println("@@登录成功：" + manager.getUserName() + "@@");
        } else {
            System.out.println("@@您没有权限进入系统，请重新登录." + "@@");
        }

        return confirmState;
    }

    /**
     * 用户登录界面处理
     * @return 如果用户登录成功，返回 true
     */
    public boolean loginInterfaceProcess() {

        Scanner sc = new Scanner(System.in);

        System.out.print(menus.showLoginMenu() + "请选择，输入数字：");

        if (1 == sc.nextInt() && StartSMS()) {
            InterfaceStackInd++;
            InterfaceStack[InterfaceStackInd] = "mainMenu";
            return true;
        }

        return false;
    }

    /**
     * 主菜单页面处理
     */
    public void mainMenuProcess() {

        System.out.print(menus.showMainMenu() + "请选择，输入数字：");
        Scanner sc = new Scanner(System.in);
        int custInput = sc.nextInt();

        if (0 == custInput) {
            InterfaceStackInd--;
        }

        if (1 == custInput) {
            InterfaceStackInd++;
            InterfaceStack[InterfaceStackInd] = "CustMMenu";
        }

        if (2 == custInput) {
            InterfaceStackInd++;
            InterfaceStack[InterfaceStackInd] = "SendGMenu";
        }
    }

    /**
     * 客户信息管理页面处理
     */
    public void CustMMenuProcess() {
        System.out.print(menus.showCustMMenu() + "请选择，输入数字：");
        Scanner sc = new Scanner(System.in);
        int custInput = sc.nextInt();

        if (0 == custInput) {
            InterfaceStackInd--;
        }
    }

    /**
     * 真情回馈页面处理
     */
    public void SendGMenuProcess() {

        System.out.print(menus.showSendGMenu() + "请选择，输入数字：");
        Scanner sc = new Scanner(System.in);
        int custInput = sc.nextInt();

        if (0 == custInput) {
            InterfaceStackInd--;
        }
    }

    public void MyShoppingDashboard() {

        while(true) {

            if (InterfaceStackInd == 0) {
                if (!loginInterfaceProcess()) {
                    break;
                }
            }

            switch (InterfaceStack[InterfaceStackInd]) {
                case "mainMenu":
                    mainMenuProcess();
                    break;
                case "CustMMenu":
                    CustMMenuProcess();
                    break;
                case "SendGMenu":
                    SendGMenuProcess();
                    break;
            }
        }
        System.out.println("程序退出！！！");
    }
}
