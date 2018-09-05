package com.ruimeng.Day14.forum;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tip {

    private String title;
    private String content;
    private String publishTime;
    private int uid;

    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        publishTime = df.format(new Date());
    }

    public Tip() {
        title = "没有办法";
        content = "我就是这么强大，快来杀我吧，哈哈哈。";
        uid = 9999;
        System.out.println("帖子类的无参构造方法。");
    }

    public Tip(String title, String content, int uid) {
        this.title = title;
        this.content = content;
        this.uid = uid;
        System.out.println("帖子类的有参构造方法。");
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public int getUid() {
        return uid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void getInfo() {
        System.out.println("====帖子信息====");
        System.out.println("帖子标题：" + title);
        System.out.println("帖子内容：" + content);
        System.out.println("发帖时间：" + publishTime);
    }

    public static void main(String[] args) {
        Tip tip1 = new Tip();
        tip1.getInfo();
        System.out.println("\n\n");
        Tip tip2 = new Tip("一个经典的Java程序", "hello world", 5555);
        tip2.getInfo();
    }
}
