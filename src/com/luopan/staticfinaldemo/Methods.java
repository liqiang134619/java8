package com.luopan.staticfinaldemo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Liq
 * @date 2019/10/14
 */
public class Methods {


    private static final Set<String> SET = new HashSet<>();


    static {
        SET.add("1");
        SET.add("2");
    }


    public boolean getSet() {
        return SET.contains("9");
    }

}
