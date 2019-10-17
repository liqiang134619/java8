//package com.luopan.Cglib;
//
//
//import com.oracle.jrockit.jfr.Producer;
//
///**
// * @author Liq
// * @date 2019/8/11
// */
//
///*
// 基于子类的动态代理：
//         *      涉及的类：Enhancer
//         *      提供者：第三方cglib库
//         *  如何创建代理对象：
//         *      使用Enhancer类中的create方法
//         *  创建代理对象的要求：
//         *      被代理类不能是最终类
//         *  create方法的参数：
//         *      Class：字节码
//         *          它是用于指定被代理对象的字节码。
//         *
//         *      Callback：用于提供增强的代码
//         *          它是让我们写如何代理。我们一般都是些一个该接口的实现类，通常情况下都是匿名内部类，但不是必须的。
//         *          此接口的实现类都是谁用谁写。
//         *          我们一般写的都是该接口的子接口实现类：MethodInterceptor
//*/
//public class ProxyClient {
//
//    public static void main(String[] args) {
//
//        final ProxyProducer producer = new ProxyProducer();
//        Producer cglibProducer = (Producer) Enhancer.create(Producer.class, new MethodInterceptor() {
//            @Override
//            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                //提供增强的代码
//                Object returnValue = null;
//
//                //1.获取方法执行的参数
//                Float money = (float)objects[0];
//                //2.判断当前方法是不是销售
//                if("saleProduct".equals(method.getName())) {
//                    returnValue = method.invoke(producer, money*0.8f);
//                }
//                return returnValue;
//            }
//        });
//        cglibProducer.saleProduct(10000f);
//
//    }
//
//}
