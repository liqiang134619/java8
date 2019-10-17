package com.example.sington;

/**
 * @author Liq
 * @date 2019/10/11
 */
public class SingtonMain {

    public static void main(String[] args) {

        EagerSington instsnce;
        for (int i = 0; i < 5; i++) {
            instsnce = EagerSington.getInstsnce();
            System.out.println(i+":"+instsnce);
        }
    }

}
