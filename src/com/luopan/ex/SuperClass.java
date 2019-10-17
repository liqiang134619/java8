package com.luopan.ex;

/**
 * @author Liq
 * @date 2019/8/16
 */
public class SuperClass {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SuperClass{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
