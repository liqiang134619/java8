package com.luopan.future;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

/**
 * @author Liq
 * @date 2019/6/20
 */
public class demo01 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        ThreadFactory factory = new ThreadFactoryBuilder().setNameFormat("thread-demo-%d").build();

        ExecutorService pool = new ThreadPoolExecutor(4, 4, 0L,
            TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(1024),factory);



        pool.execute(()->{
            System.out.println(Thread.currentThread().getName());
        });
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName());
        });
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName());
        });
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName());
        });
        pool.execute(()->{
            System.out.println(Thread.currentThread().getName());
        });







//
//
//        executorService.execute(()->{
//            System.out.println(Thread.currentThread().getName());
//        });
//        executorService.shutdown();
//
//        int i = Runtime.getRuntime().availableProcessors();
//        System.out.println(i);


    }







}
