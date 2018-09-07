package com.ruimeng.Day16;

public class CharCount {

    public static int charCount(String str, char counted) {

        int count = 0;

        for (char tmpChar : str.toCharArray()) {
            if (counted == tmpChar) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(CharCount.charCount("ruimengruimengruimeng", 'n'));
    }
}
