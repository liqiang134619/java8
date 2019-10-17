package com.example.factoryMethod;

/**
 *
 *   工厂方法模式又叫虚拟构造模式或者多态工厂模式：
 *      工厂方法模式定义了一个创建对象的接口，但是由子类决定要实例化的类是那一个，
 *   工厂方法让类的把实例化推迟到子类。
 *
 *
 *
 * 工厂方法创造小明
 *
 * @author Liq
 * @date 2019/10/11
 */
public class FactoryMain {

    public static void main(String[] args) {
        PraiseOneFactory oneFactory = new PraiseOneFactory();
        IXiaoMing xiaoMing = oneFactory.createXiaoMing();
        xiaoMing.industry();
        xiaoMing.skillOne();
        xiaoMing.skillTwo();
        System.out.println("======================");


        PraiseTwoFactory twoFactory = new PraiseTwoFactory();
        IXiaoMing xiaoMing1 = twoFactory.createXiaoMing();
        xiaoMing1.industry();
        xiaoMing1.skillTwo();
        xiaoMing1.skillOne();

    }

}
