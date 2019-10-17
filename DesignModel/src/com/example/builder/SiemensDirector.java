package com.example.builder;

/**
 * @author Liq
 * @date 2019/10/11
 */
public class SiemensDirector {

    private WasherBuilder builder;

    SiemensDirector(WasherBuilder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.build1();
        builder.build2();
        builder.build3();
        builder.build4();
    }
}
