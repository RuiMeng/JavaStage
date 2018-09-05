package com.ruimeng.Day14.forum;

public class User {

    private int uId;
    private String uName;
    private String uPass;

    public User(String uName, String uPass) {
        this.uName = uName;
        this.uPass = uPass;
        this.uId = (int)((Math.random()*9+1)*1000);
    }

    public int getuId() {
        return uId;
    }

    public String getuName() {
        return uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public void getUserInfo() {
        System.out.println("====用户信息====");
        System.out.println("用户名：" + uName + "\n" +
                "用户密码：" + uPass);
    }

    public static void main(String[] args) {
        ;
    }
}
