package com.luopan.proxys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Liq
 * @date 2019/8/11
 */
public class Test {


    public static void main(String[] args) {
        System.out.println("no proxy");
        Hello hello = new Hello();
        hello.sayHello();

        System.out.println("=======================");
        Hello hello1 = new Hello();
        IHello instance = (IHello) Proxy.newProxyInstance(hello1.getClass().getClassLoader(), hello1.getClass().getInterfaces(),
            (proxy, method, args1) -> {
                System.out.println("before hello");
                Object invoke = method.invoke(hello1, args1);
                System.out.println("after hello");
                return invoke;
            });
        instance.sayHello();

    }

}
