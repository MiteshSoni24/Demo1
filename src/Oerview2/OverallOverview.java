package Oerview2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OverallOverview {
    public static void main(String[] args) {
        Map<String,String> map1=new HashMap<>();
        map1.put("hello","hello");
        map1.put("hi","hello");
        System.out.println(map1);//{hi=hello, hello=hello}

        Set<Map.Entry<String,String>> set=map1.entrySet();
        System.out.println(set);//[hi=hello, hello=hello]
    }
}
