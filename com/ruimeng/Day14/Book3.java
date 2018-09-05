package com.ruimeng.Day14;

public class Book3 {

    private String title;
    private String type;
    private int pageNum;

    public Book3(String title, int pageNum) {
        this.title = title;
        this.type = "计算机";
        this.pageNum = pageNum;
    }

    public Book3(String title, String type, int pageNum) {
        this.title = title;
        this.type = type;
        this.pageNum = pageNum;
    }

    public void detail() {
        System.out.println("title:" + title + "\ttype:" + type + "\tpageNum:" + pageNum);
    }
}
