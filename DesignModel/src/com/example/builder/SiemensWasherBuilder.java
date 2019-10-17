package com.example.builder;

/**
 * @author Liq
 * @date 2019/10/11
 */
public class SiemensWasherBuilder implements WasherBuilder {

    private  SiemensWasher siemensWasher = new SiemensWasher();

    @Override
    public void build1() {
        siemensWasher.setColor("red");
    }

    @Override
    public void build2() {
        siemensWasher.setDoor("123");
    }

    @Override
    public void build3() {
        siemensWasher.setSkeleton("456");
    }

    @Override
    public void build4() {
        siemensWasher.setWheels("789");
    }

    public SiemensWasher retrieveWasher() {
        return this.siemensWasher;
    }
}
