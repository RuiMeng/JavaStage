package com.ruimeng.Day14.loveHomeShopping;

public class MyShoppingManager {
    private String userName;
    private String passWord;

    public MyShoppingManager(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        System.out.println(show());
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String show() {
        return "管理员：" + userName + "\t密码：" + passWord;
    }
}
