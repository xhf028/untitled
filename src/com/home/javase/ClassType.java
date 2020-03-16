package com.home.javase;

import java.util.*;

/**
 * @author Xianghongfei
 * @date 2020/2/15 - 14:08
 */

public class ClassType {
    public static void main(String[] args) {
       Map map = new HashMap();
       map.put("one",new Student("das",12,2));
       Set set = map.keySet();
       String s = (String) set.iterator().next();
       System.out.println(s);
       Properties load = System.getProperties();
      Properties pro = new Properties();

    }


}
