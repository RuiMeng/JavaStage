package com.ruimeng.Day11;

public class SwitchPoker {
    public static void main(String[] args) {
        int leftPokerCard = 10, rightPokerCard = 8;
        int tmp;

        System.out.println("输出交换前手中的纸牌：");
        System.out.println("左手手中的纸牌为 -- " + leftPokerCard);
        System.out.println("右手手中的纸牌为 -- " + rightPokerCard);

        tmp = leftPokerCard;
        leftPokerCard = rightPokerCard;
        rightPokerCard = tmp;

        System.out.println("输出交换后手中的纸牌：");
        System.out.println("左手手中的纸牌为 -- " + leftPokerCard);
        System.out.println("右手手中的纸牌为 -- " + rightPokerCard);
    }
}
