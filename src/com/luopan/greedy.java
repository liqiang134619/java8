package com.luopan;

/**
 * @author Liq
 * @date 2019/7/25
 */
public class greedy {

    public static void main(String[] args) {

        int money = 123;
        change(money);
    }

    private static void change(int money) {

        int[] changs = {100,50,20,10,5,1};
        int[] index = new int[6];
        int total = 0;

        for(int i = 0; i < 6;) {
            if(total + changs[i] > money) {
                i++;
                continue;
            }
            total += changs[i];
            index[i]++;
            if(total == money) {
                break;
            }
        }

        for(int i = 0; i < 6; i++) {
            if(index[i]!=0) {
                switch (i) {
                    case 0:
                        System.out.println("100：" + index[i] +"张");
                        break;
                    case 1:
                        System.out.println("50：" + index[i] +"张");
                        break;
                    case 2:
                        System.out.println("20：" + index[i] +"张");
                        break;
                    case 3:
                        System.out.println("10：" + index[i] +"张");
                        break;
                    case 4:
                        System.out.println("5：" + index[i] +"张");
                        break;
                    case 5:
                        System.out.println("1：" + index[i] +"张");
                        break;
                    default:

                }
            }
        }
    }

}
