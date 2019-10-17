package com.luopan.stream.parallel;

import com.luopan.stream.Dish;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Liq
 * @date 2019/8/26
 */
public class Tests {

    public static void main(String[] args) {

///        long nanoTime = System.nanoTime();
//        long parallels = parallels(10000000);
//        System.out.println(parallels);
//        // 4192094190 p
//        // 443894775 no p
//        // 11722476 for each
//
//        /*
//          并行流执行的时间大于非并行流执行的时间
//         */
//        System.out.println(System.nanoTime() - nanoTime);

        // 90692762
        // 100663975
        // 121404675
        // 101282827
//        long nanoTime = System.nanoTime();
//        List<Integer> lists = new ArrayList<>();
//        for (int i = 0; i < 100000000; i++) {
//            lists.add(i);
//        }
//        lists.forEach(integer -> {
//            integer += 1;
//        });
//
//        Integer
//
//        System.out.println(System.nanoTime() - nanoTime);





    }

    private static long parallels(long num) {
///        return Stream.iterate(1L, i -> i + 1)
//            .limit(num)
//            .reduce(0L,Long::sum);
//        long sum = 0L;
//        for (long i = 0; i < num; i++) {
//            sum += 1;
//        }
//        return sum;

        /// 使用rangeClosed
        // 124101703
        // 148649414
//        return LongStream.rangeClosed(1,num).reduce(0L,Long::sum);
//        return LongStream.rangeClosed(1,num).parallel().reduce(0L,Long::sum);
        return 0;
    }

}
