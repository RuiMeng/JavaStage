package com.ruimeng.Day17;

public class NewsTitle {

    private int nId;
    private String nName;
    private String nAuthor;

    {
        nId = (int)((Math.random()*9+1)*1000);
    }

    public NewsTitle(String nName, String nAuthor) {
        this.nName = nName;
        this.nAuthor = nAuthor;
    }

    public int getnId() {
        return nId;
    }

    public String getnName() {
        return nName;
    }

    public String getnAuthor() {
        return nAuthor;
    }
}
