package com.ruimeng.Day14.loveHomeShopping;

public class DebugCode {

    public static void main(String[] args) {
        // 系统初始化，设置系统的管理员
        MyShoppingManager sManager = new MyShoppingManager("ruimeng", "000000");
        MyShoppingSystem sSystem = new MyShoppingSystem(sManager);

        // 让系统开始工作
        sSystem.MyShoppingDashboard();
    }

}
