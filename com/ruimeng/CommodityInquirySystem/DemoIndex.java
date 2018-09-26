package com.ruimeng.CommodityInquirySystem;

import java.util.Scanner;

public class DemoIndex {

    private static void mainMenuShow() {
        String mainMenu = "-----欢迎使⽤商品查询系统-----\n" +
                "------1.显示所有商品\n" +
                "------2.按价格从低到⾼显示商品\n" +
                "------3.根据ID查询商品名称\n" +
                "------4.根据商品种类查询商品信息\n" +
                "------5.根据价格区间查询商品\n" +
                "------0.退出系统\n";

        System.out.print(mainMenu);
    }

    public static void rewardMainFlow() {

        CommodityManager commodityManager = new CommodityManager();
        Commodity[] commodities;
        commodities = commodityManager.initCommodityArray();
        Scanner sc = new Scanner(System.in);
        while (true){
            mainMenuShow();
            System.out.print("请选择：");
            switch (sc.nextInt()) {
                case 1:
                    commodityManager.showAll(commodities);
                    break;
                case 2:
                    commodityManager.showAllByPrice(commodities);
                    break;
                case 3:
                    System.out.print("请输⼊需要查询的id号：");
                    commodityManager.queryNameByNo(commodities, sc.nextInt());
                    break;
                case 4:
                    System.out.print("请输⼊需要查询的商品种类：");
                    commodityManager.queryByType(commodities, sc.next());
                    break;
                case 5:
                    System.out.print("请输⼊最低的价格（包含）：");
                    float downPrice = sc.nextFloat();
                    System.out.print("请输⼊最高的价格（包含）：");
                    float upPrice = sc.nextFloat();
                    commodityManager.queryByPriceRange(commodities, upPrice, downPrice);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("请选择正确的项目！！！");
                    break;
            }
        }
    }
}
