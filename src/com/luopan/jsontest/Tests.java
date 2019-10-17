package com.luopan.jsontest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

/**
 * @author Liq
 * @date 2019/8/29
 */
public class Tests {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge("123");
        student.setName("永强");
        String s = JSON.toJSONString(student);
        System.out.println(s);
        JSONObject jsonObject = JSON.parseObject(s);
//        JSONObject name = jsonObject.getJSONObject("name");
//        System.out.println(name);
        String s1 = JSONPath.read(s, "$.name").toString();
        System.out.println(s1);
    }

}
