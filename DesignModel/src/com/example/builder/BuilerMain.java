package com.example.builder;

/**
 * @author Liq
 * @date 2019/10/11
 */
public class BuilerMain {

    public static void main(String[] args) {
        SiemensWasherBuilder builder = new SiemensWasherBuilder();

        SiemensDirector director = new SiemensDirector(builder);
        director.construct();
        SiemensWasher siemensWasher = builder.retrieveWasher();
        System.out.println(siemensWasher);

    }

}
