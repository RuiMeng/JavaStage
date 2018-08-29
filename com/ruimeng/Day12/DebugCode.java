package com.ruimeng.Day12;

public class DebugCode {
    String name = "RuiMeng";
    public void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        int[] nums0;
        int[] nums1 = new int[5];
        int[] nums2 = new int[]{1, 2, 3, 4, 5};
        // 我认为你这个是另类的，我把它排除在我的记忆体系里
        int[] nums3 = {1, 2, 3, 4, 5};

//        nums0 = {1, 2, 3, 4, 5};
//        nums0 =new int[5]{1, 2, 3, 4, 5};
        nums0  =new int[]{1, 2, 3, 4, 5};
        nums0 = new int[5];

    }
}
