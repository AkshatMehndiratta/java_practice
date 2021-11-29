package map;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
//        tree map shows output in sorted order
        TreeMap<String, Integer> tm = new TreeMap<>();
//        adding entries into map
        tm.put("akshat",19);
        tm.put("sam",22);
        tm.put("gurvit",16);
        System.out.println(tm);
//        if keys are duplicate, value will override
        tm.put("akshat",20);
//        here we are preventing overriding
        tm.putIfAbsent("sam",23);
        System.out.println(tm);        
    }
}
