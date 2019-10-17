package com.luopan.futureT;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author Liq
 * @date 2019/8/2
 */
public class mains {


    public static void main(String[] args) {


        Shop shop = new Shop();
        Future<Double> async = shop.getPriceAsync("嘿嘿");
        System.out.println(Thread.currentThread().getName());
        System.out.println("==================");


        try {
            Double aDouble = async.get();
            System.out.println(aDouble);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        async.cancel(true);


    }
}
