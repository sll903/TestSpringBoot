package com.test.java.demo.utils;

import com.alibaba.fastjson.JSON;
import com.test.java.demo.bean.Student;

import java.util.HashMap;
import java.util.Map;

public class testDemo {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        Student student1 = new Student();
        student1.setName("zhangsan");
        student1.setAge("20");
        System.out.println(student1);
        map.put("name", student1);
        System.out.println(map);
        String s2 = JSON.toJSONString(map);
        System.out.println(s2);
    }
}

