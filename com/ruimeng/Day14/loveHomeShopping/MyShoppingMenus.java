package com.ruimeng.Day14.loveHomeShopping;

public class MyShoppingMenus {

    /**
     * 登录菜单
     */
    public String showLoginMenu() {

        return "欢迎使用我爱我家购物管理系统\n" +
                "1. 登录系统\n" +
                "2. 退出\n";
    }

    /**
     * 主菜单
     */
    public String showMainMenu() {

        return "我爱我家购物管理系统主菜单\n" +
                "1. 客户信息管理\n" +
                "2. 真情回馈\n";
    }

    /**
     * 客户管理菜单
     */
    public String showCustMMenu() {
        return "客户信息管理\n" +
                "1. 显示所有客户信息\n" +
                "2. 添加客户信息\n" +
                "3. 修改客户信息\n" +
                "4. 查询客户信息\n";
    }

    /**
     * 真情回馈菜单
     */
    public String showSendGMenu() {
        return "真情回馈\n";
    }
}
