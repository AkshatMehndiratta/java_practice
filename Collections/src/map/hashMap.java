package map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
//        in hash map order is not preserved and keys are unique
        HashMap<String,Integer> hm = new HashMap<>();
//        adding entries into map
        hm.put("akshat",19);
        hm.put("gurvit",16);
        hm.put("sam",22);
        System.out.println(hm);
//        if keys are duplicate, value will override
        hm.put("akshat",20);
//        here we are preventing overriding
        hm.putIfAbsent("sam",23);
        System.out.println(hm);
        for(Map.Entry<String,Integer> e: hm.entrySet()){
            System.out.println(e);
        }
    }
}
