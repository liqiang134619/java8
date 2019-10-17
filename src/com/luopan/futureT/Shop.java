package com.luopan.futureT;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

/**
 * @author Liq
 * @date 2019/8/2
 */
public class Shop {

    private Random random;

    ExecutorService executorService = new ThreadPoolExecutor(1,1,0L,
        TimeUnit.MILLISECONDS,
        new LinkedBlockingDeque<>(1024));

    public Future<Double> getPriceAsync(String product) {

        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        executorService.execute(() -> {
            System.out.println(Thread.currentThread().getName());
            double price = calculatePrice(product);
            futurePrice.complete(price);
        });

        return futurePrice;
    }

    public Future<Double> getPriceAsync1(String product) {

       return CompletableFuture.supplyAsync(()->calculatePrice(product),executorService);
    }


    public double getPrice(String product) {
        return calculatePrice(product);
    }

    private double calculatePrice(String product) {
        Random random = new Random();
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    private static void delay() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
