package com.luopan.testss;

/**
 * @author Liq
 * @date 2019/7/16
 */
public class MyLinkedListTest {


    public static void main(String[] args) {


        MyLinkedList<String> lists = new MyLinkedList<>();
        lists.addElement("one");
        lists.addElement("two");
        lists.addElement("three");
        lists.addElement("three");
        lists.addElement("three");
        lists.addElement("four");

        // 遍历节点
        for(int i = 0; i < lists.size(); i++) {
            System.out.println(lists.getElementById(i));
        }

//        // 删除节点
//        String s = lists.deleteById(2);
//        System.out.println(s);
//
//
//        // 遍历节点
//        for(int i = 0; i < lists.size(); i++) {
//            System.out.println(lists.getElementById(i));
//        }
    }

}
