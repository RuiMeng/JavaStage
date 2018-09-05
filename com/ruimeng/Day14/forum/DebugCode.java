package com.ruimeng.Day14.forum;

public class DebugCode {
    public static void main(String[] args) {
        Tip tip1 = new Tip();
        tip1.setTitle("Java板块测试帖1");
        tip1.setContent("你看不见我，你看不见我！");
        tip1.getInfo();

        System.out.println("\n\n");
        Tip tip2 = new Tip("Java板块测试帖1", "你看不见我，你看不见我！", 5555);
        tip2.getInfo();
    }
}
