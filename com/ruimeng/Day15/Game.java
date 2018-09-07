package com.ruimeng.Day15;

public class Game {

    private Player player;

    public Game(Player player) {
        this.player = player;
    }

    /**
     * 生成的字符串的字符范围是 '!' 到 '~'。
     * @param strLength 需要生成的字符串的长度。
     * @return 生成的字符串。
     */
    public String printStr(int strLength) {

        char charBaseLine = 'a';
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strLength; i++) {
            stringBuilder.append((char)((int)charBaseLine + (int)(Math.random() * 25)));
        }

        return stringBuilder.toString();
    }

    public boolean printResult(String out, String in) {

        boolean state = false;
        if (out.equals(in)) {
            System.out.print("输入正确!");
            state = true;
        } else {
            System.out.println("输入错误！");
        }

        return state;
    }
}
