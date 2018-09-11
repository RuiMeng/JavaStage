package com.ruimeng.Day17;

import java.util.HashMap;

public class CountryAbb {

    public static void main(String[] args) {

        HashMap<String, String> countryAbb = new HashMap<>();

        countryAbb.put("CHN", "中国");
        countryAbb.put("USA", "美国");
        countryAbb.put("IR", "伊朗");
        countryAbb.put("JP", "日本");
        countryAbb.put("FR", "法国");

        System.out.println("映射集合中共有 " + countryAbb.size() + " 个元素。");
        System.out.println("映射集合存在键 FR 的元素： " + countryAbb.containsKey("FR"));
        System.out.println("从映射集合中删除键为 FR 的元素。");
        countryAbb.remove("FR");
        System.out.println("映射集合存在键 FR 的元素： " + countryAbb.containsKey("FR"));
        System.out.println("映射集合中键的集合： " + countryAbb.keySet());
        System.out.println("映射集合中值的集合： " + countryAbb.values());
        System.out.println("映射集合为空： " + countryAbb.isEmpty());
        System.out.println("清空映射集合");
        countryAbb.clear();
        System.out.println("映射集合为空： " + countryAbb.isEmpty());

    }
}
