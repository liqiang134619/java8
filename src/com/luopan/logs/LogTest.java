package com.luopan.logs;

import java.lang.reflect.Method;

/**
 * @author Liq
 * @date 2019/9/19
 */


public class LogTest {

    @MyLog(value = "嘿嘿",type = "1")
    public void test() {
        System.out.println("11");
    }


    public static void main(String[] args) throws NoSuchMethodException {

//        Method method = LogTest.class.getMethod("test");
//        MyLog annotation = method.getAnnotation(MyLog.class);
//        if(annotation !=null) {
//            System.out.println(annotation.type());
//            System.out.println(annotation.value());

        Object object = new Integer(12);
        System.out.println(object instanceof Integer);


    }

}
