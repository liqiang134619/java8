package com.luopan.ex;

/**
 * @author Liq
 * @date 2019/8/16
 */
public class SubClass extends SuperClass {

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "SubClass{" +
            "sex='" + sex + '\'' +
            '}';
    }
}
