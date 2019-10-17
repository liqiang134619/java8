package com.luopan.testss;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Liq
 * @date 2019/7/16
 */
public class SortDemo {


    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

//        // 输入八个整数进行排序
//        System.out.println("please input eight number");
//
//        int[] numbers = new int[8];
//        for (int i = 0; i < 8; i++) {
//            if( i == 0) {
//                System.out.println("please input the first number");
//                numbers[i] = in.nextInt();
//                continue;
//            }
//            if (i == 1) {
//                System.out.println("please input the second number");
//                numbers[i] = in.nextInt();
//                continue;
//            }
//            if (i == 2) {
//                System.out.println("please input the third number");
//                numbers[i] = in.nextInt();
//                continue;
//            }
//
//            System.out.println("please input the " + (i + 1) + "th number");
//            numbers[i] = in.nextInt();
//        }


        int[] numbers = {1,23,343,2,324,4,343,2,423423,2,24,21,2434,54,33,33,43};

        // 开始排序
        sortBuble(numbers);

        System.out.println(Arrays.toString(numbers));

    }

    private static void sortBuble(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++) {
            boolean flag = false;
            for(int j = 0; j < numbers.length - i - 1; j ++) {
                if(numbers[j] > numbers[j + 1]) {
                    int tem = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tem;
                    flag = true;
                }

            }
            if (!flag) {
                break;
            }
        }
    }

}
