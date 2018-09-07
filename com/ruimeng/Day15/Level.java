package com.ruimeng.Day15;

public class Level {

    /**
     * levelNo 游戏等级
     * strLength 该等级游戏的字符串长度
     * strTimes 该等级需要输出几次字符串
     * timeLimit 完成该等级限制的时间
     * perScore 该等级每轮的得分
     */
    private int levelNo;
    private int strLength;
    private int strTimes;
    private int timeLimit;
    private int perScore;

    public Level(int levelNo, int strLength, int strTimes, int timeLimit, int perScore) {
        this.levelNo = levelNo;
        this.strLength = strLength;
        this.strTimes = strTimes;
        this.timeLimit = timeLimit;
        this.perScore = perScore;
    }

    public int getLevelNo() {
        return levelNo;
    }

    public int getStrLength() {
        return strLength;
    }

    public int getStrTimes() {
        return strTimes;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public int getPerScore() {
        return perScore;
    }
}
