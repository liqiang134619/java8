package com.example.builder;

/**
 * @author Liq
 * @date 2019/10/11
 */
public class SiemensWasher {
    private String color;
    private String wheels;
    private String door;
    private String skeleton;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    @Override
    public String toString() {
        return "SiemensWasher{" +
            "color='" + color + '\'' +
            ", wheels='" + wheels + '\'' +
            ", door='" + door + '\'' +
            ", skeleton='" + skeleton + '\'' +
            '}';
    }
}
