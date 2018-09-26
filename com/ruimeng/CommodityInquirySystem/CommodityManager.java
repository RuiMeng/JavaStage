package com.ruimeng.CommodityInquirySystem;

import java.util.Arrays;

public class CommodityManager {

    public Commodity[] initCommodityArray() {

        Commodity[] commodities = new Commodity[10];
        commodities[0] = new Commodity(1, "变形⾦刚", "玩具", 26);
        commodities[1] = new Commodity(2, "芭⽐娃娃", "玩具", 52);
        commodities[2] = new Commodity(3, "智⼒拼图", "玩具", 12);
        commodities[3] = new Commodity(4, "铅笔", "⽂具", 6);
        commodities[4] = new Commodity(5, "橡⽪", "⽂具", 2);
        commodities[5] = new Commodity(6, "圆规", "⽂具", 7);
        commodities[6] = new Commodity(7, "盗墓笔记", "书籍", 26);
        commodities[7] = new Commodity(8, "故事会", "书籍", 26);
        commodities[8] = new Commodity(9, "时尚杂志", "书籍", 26);
        commodities[9] = new Commodity(10, "⻄游记", "书籍", 126);

        return commodities;
    }

    /**
     * 1.显示所有的商品信息
     */
    public void showAll(Commodity[] commodities) {

        System.out.println("商品编号\t\t商品名称\t\t商品种类\t\t商品价格");
        for (Commodity commodity : commodities) {
            commodity.show();
        }
    }

    /**
     * 2.按价格从低到高显示商品
     */
    public void showAllByPrice(Commodity[] commodities) {
        Commodity[] tmp = commodities.clone();
        Arrays.sort(tmp);
        showAll(tmp);
    }

    /**
     * 3.根据 ID 查询商品名称
     */
    public void queryNameByNo(Commodity[] commodities, int cNo) {

        boolean existFlag = false;
        for (Commodity tmp : commodities) {
            if (tmp.getcNo() == cNo) {
                System.out.println("商品编号\t\t商品名称\t\t商品种类\t\t商品价格");
                existFlag = true;
                tmp.show();
            }
        }

        if (!existFlag) {
            System.out.println("没有找到对应的商品，请检查id号是否正确！");
        }
    }

    /**
     * 4.根据商品种类查询商品信息
     */
    public void queryByType(Commodity[] commodities, String type) {

        boolean existFlag = false;
        for (Commodity tmp : commodities) {
            if (type.equals(tmp.getcType())) {
                if (!existFlag) {
                    System.out.println("商品编号\t\t商品名称\t\t商品种类\t\t商品价格");
                    existFlag = true;
                }
                tmp.show();
            }
        }

        if (!existFlag) {
            System.out.println("没有找到对应的商品，请检查商品类型是否存在！");
        }
    }

    /**
     * 5. 根据价格区间查询商品
     */
    public void queryByPriceRange(Commodity[] commodities, float upPrice, float downPrice) {

        boolean existFlag = false;
        for (Commodity tmp : commodities) {
            if (tmp.getcPrice() <= upPrice && tmp.getcPrice() >= downPrice) {
                if (!existFlag) {
                    System.out.println("商品编号\t\t商品名称\t\t商品种类\t\t商品价格");
                    existFlag = true;
                }
                tmp.show();
            }
        }

        if (!existFlag) {
            System.out.println("没有找到对应的商品，请检查价格区间是否合理！");
        }
    }
}
