package com.example.sington;

/**
 * @author Liq
 * @date 2019/10/11
 */
public class LazySington {

    private static LazySington instance = null;

    private LazySington() {

    }

    public static LazySington getInstance() {
        if(instance == null) {
            instance = new LazySington();
        }
        return instance;
    }
}
