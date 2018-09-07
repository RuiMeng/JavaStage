package com.ruimeng.Day16;

import java.util.Scanner;

public class CustomerRegister {

    private String userName;
    private String userPassWorld;

    public boolean userRegister() {

        boolean state = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("请输入用户名（最小长度为3）：");
            userName = sc.next();
        } while (userName.length() < 3);

        do {
            System.out.print("请输入密码（最小长度为6）：");
            userPassWorld = sc.next();
        } while (userPassWorld.length() < 6);

        System.out.print("请再次确认密码：");
        state = userPassWorld.equals(sc.next());

        System.out.println(state ? "注册成功！" : "注册失败！");

        return state;
    }

    public static void main(String[] args) {
        CustomerRegister reg = new CustomerRegister();
        System.out.println(reg.userRegister());
    }
}
