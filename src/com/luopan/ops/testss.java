package com.luopan.ops;

import java.io.File;

/**
 * @author Liq
 * @date 2019/7/31
 */
public class testss {

    public static void main(String[] args) {

        double[] nums = {1,2};
        int n = 5;
        int x = 2;
        double f = f(nums, 2, 1);
        System.out.println(f);


    }

    private static double f(double[] nums,int x, int n) {
        double p = nums[n];
        for(int i = n; i > 0; i--) {
            p = nums[i-1] + p*x;
        }
        return p;
    }
}
