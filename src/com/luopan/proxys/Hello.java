package com.luopan.proxys;

/**
 * @author Liq
 * @date 2019/8/11
 */
public class Hello implements IHello {

    @Override
    public void sayHello() {
        System.out.println("just say hello");
    }
}
