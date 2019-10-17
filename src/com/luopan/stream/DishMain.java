package com.luopan.stream;

import com.luopan.stream.Dish.CaloricLevel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import sun.rmi.runtime.Log;


/**
 * @author Liq
 * @date 2019/6/5
 */
public class DishMain {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH) );

        Integer reduce = menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
        System.out.println(reduce);

        int sum = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println(sum);

//        menu.stream().map()

//
//        menu.stream().filter(s -> s.getCalories() > 400)
//            .map(Dish::getName)
//            .limit(3)
//            .collect(Collectors.toList())
//            .forEach(System.out::println);

//        List<Dish> ss = new ArrayList<>();
//
//        List<Dish> collect = menu.stream().parallel().filter(dish -> {
//            if (dish.getCalories() > 400) {
//                ss.add(dish);
//                return false;
//            }
//            return true;
//        }).collect(Collectors.toList());
////
//        System.out.println(collect);
//        System.out.println(ss);
//        System.out.println("ss");
////

//        Long[] collectionId = new Long[]{123L};
//        System.out.println(collectionId.toString());


//        Optional<Dish> reduce = menu.stream()
//            .reduce((s1, s2) -> s1.getCalories() < s2.getCalories() ? s1 : s2);
//        Dish dish = reduce.get();
//        System.out.println(dish);
//
//        System.out.println("-------------------------------------");
//
//        //  option<T>  findAny  查找任意一个元素，返回option对象
//        menu.stream().filter(Dish::isVegetarian)
//            .findAny().ifPresent(System.out::println);
//
//        // boolean allMatch 匹配所有元素
//        boolean b = menu.stream().anyMatch(s -> s.getCalories() > 1000);
//
//        // 查找第一个元素
//        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
//        someNumbers.stream().map(i->i*i)
//            .filter(i-> i%3 == 0)
//            .findFirst()
//            .ifPresent(System.out::println);
//
//        //  归约
//        // 元素求和
//        Integer reduce1 = someNumbers.stream().reduce(0, (i, ii) -> i + ii);
//        System.out.println(reduce1);
//
//        Integer reduce4 = someNumbers.stream().reduce(0, Integer::sum);
//
//
//        // 乘法
//        Integer reduce2 = someNumbers.stream().reduce(1, (i, ii) -> i * ii);
//        System.out.println(reduce2);
//
//        // 最值
//        someNumbers.stream().reduce(Integer::max).ifPresent(System.out::println);
//        someNumbers.stream().reduce(Integer::min).ifPresent(System.out::println);
//
//        // 一共有多少菜品
//        Integer reduce3 = menu.stream().map(s -> 1)
//            .reduce(0, Integer::sum);
//        System.out.println(reduce3);
//
//
//        // 收集， 分组
//        menu.stream().collect(Collectors.counting());
//        menu.stream().count();
//        menu.size();
//
//        //  求和，平均值， 最值
//        IntSummaryStatistics collect1 = menu.stream()
//            .collect(Collectors.summarizingInt(Dish::getCalories));
//
//        System.out.println("-------------排序---------");
//        // 排序
//        menu.sort(Comparator.comparing(Dish::getCalories).reversed());
//        menu.forEach(System.out::println);
//        menu.forEach( s-> System.out.println(s));
//
//        // enum
//        CaloricLevel[] values = CaloricLevel.values();
//        for (CaloricLevel value : values) {
//            System.out.println(value);
//        }
//

    }

}
