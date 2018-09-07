package com.ruimeng.Day15;

import java.util.Scanner;

public class Player {

    private int levelNo;
    private int curScore;
    private int startTime;
    private float elapsedTime;

    {
        levelNo = 1;
        curScore = 0;
        startTime = 0;
        elapsedTime = 0;
    }

    public int getLevelNo() {
        return levelNo;
    }

    public int getCurScore() {
        return curScore;
    }

    public int getStartTime() {
        return startTime;
    }

    public float getElapsedTime() {
        return elapsedTime;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public void setCurScore(int curScore) {
        this.curScore = curScore;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public void play() {

        Scanner sc = new Scanner(System.in);
        Game game = new Game(this);
        String fromGame;
        String userInput;

        for (Level tLevel : LevelParam.level) {

            levelNo = tLevel.getLevelNo();
            System.out.println("======第 " + tLevel.getLevelNo() + " 关======");
            System.out.println("======限时：" + tLevel.getTimeLimit() +"s======");

            long startTime=System.currentTimeMillis();
            for (int i = 0; i < tLevel.getStrTimes(); i++) {

                // 获取 game 生成的字符串
                fromGame = game.printStr(tLevel.getStrLength());
                System.out.println(fromGame);

                // 获取 player 输入的字符串
                System.out.print("请输入：");
                userInput = sc.next();

                // 处理本次游戏结果1
                // 每获取到一次用户输入先看看是否超时
                long curTime=System.currentTimeMillis();//记录结束时间
                elapsedTime=(float)(curTime-startTime)/1000;
                if (elapsedTime > tLevel.getTimeLimit()) {
                    System.out.println("您输入的太慢，已经超时，退出！");
                    System.out.println("您最终的积分:" + curScore +
                            "\t您最终的级别:" + levelNo);
                    System.exit(0);
                }

                // 处理本次游戏结果2
                if (game.printResult(fromGame, userInput)) {
                    curScore += tLevel.getPerScore();
                    System.out.println("您的积分:" + curScore +
                            "\t您的级别:" + levelNo + "\t本轮您已经用时:" + elapsedTime);
                } else {
                    System.out.println("您最终的积分:" + curScore +
                            "\t您最终的级别:" + levelNo);
                    System.exit(0);
                }
            }
            System.out.println("恭喜你通过了第 " + tLevel.getLevelNo() + " 关");
        }

        System.out.println("胜利！！！");
    }
}
