package com.luopan.instances;

/**
 * @author Liq
 * @date 2019/9/19
 */
public class Mains {


    public static void main(String[] args) {

        Object d = new Da();
        if(d instanceof Student) {
            System.out.println("=");
        }
    }

}
