package com.ruimeng.Day17;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    
    public static void main(String[] args) {

        LinkedList<NewsTitle> newsList = new LinkedList<>();

        newsList.add(new NewsTitle("震惊！老母猪半夜惨叫", "震惊部"));
        newsList.add(new NewsTitle("震惊！美国总统看到后都惊呆了！", "UC 震惊部"));
        newsList.add(new NewsTitle("教师节送花被罚站", "百度"));
        newsList.add(new NewsTitle("裸条贷女孩卖淫", "百度"));
        newsList.add(new NewsTitle("黄牛转战APP", "百度"));

        System.out.println("新闻的总标题数为：" + newsList.size());

        //iterator 和 iterable 的区别？
        Iterator<NewsTitle> newsTitles = newsList.iterator();
        while (newsTitles.hasNext()) {
            NewsTitle newsTitle = newsTitles.next();
            System.out.println(
                    "新闻的标题是：" + newsTitle.getnName() +
                    ", 新闻的作者是：" + newsTitle.getnAuthor() + "。");
        }

        System.out.println("*******************************************");
        for (NewsTitle newsTitle : newsList) {
            System.out.println(
                    "新闻的标题是：" + newsTitle.getnName() +
                    ", 新闻的作者是：" + newsTitle.getnAuthor() + "。");
        }

    }
}
