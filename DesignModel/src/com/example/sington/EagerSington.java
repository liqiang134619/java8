package com.example.sington;

/**
 * @author Liq
 * @date 2019/10/11
 */
public class EagerSington {

    private static final  EagerSington INSTSNCE = new EagerSington();

    private EagerSington() {

    }

    public static EagerSington getInstsnce() {
        return INSTSNCE;
    }

}
