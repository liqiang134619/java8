package com.luopan.stream.parallel;

/**
 * @author Liq
 * @date 2019/8/28
 */
public enum Young {

    /**
     * 这就是一个永强
     */
    YONG_QIANG("永强"),
    ZHANG_FAN("张帆"),
    XIAOMING("小明");


    private String name;


    Young(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Young[] values = Young.values();
        for (Young value : values) {
            System.out.println(value);
        }

        String s = XIAOMING.name;
    }


}


