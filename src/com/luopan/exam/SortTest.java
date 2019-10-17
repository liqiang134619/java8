package com.luopan.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Liq
 * @date 2019/7/12
 */
public class SortTest {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



         // 输入八个整数进行排序
        System.out.println("please input eight number");

        int[] numbers = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            numbers[i] = in.nextInt();
        }
        // 开始排序
        quicksort(numbers, 0, numbers.length - 1);

        // 输出排序后的数组bush
        System.out.println("排序后的结果");
        System.out.println(Arrays.toString(numbers));


    }

    private static void quicksort(int[] arrays, int left, int right) {

        int t,i,j,temp;
        if (left > right) {
            return;
        }
        // 第一个数为基准
        temp = arrays[left];
        i = left;
        j = right;

        while (i != j) {
            while (arrays[j] >= temp && i < j) {
                j --;
            }
            while (arrays[i] <= temp && i < j) {
                i ++;
            }
            if (i < j) {
                t = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = t;
            }
        }
        arrays[left] = arrays[i];
        arrays[i] = temp;
        quicksort(arrays,left,i -1);
        quicksort(arrays,i +1,right);

    }

}
