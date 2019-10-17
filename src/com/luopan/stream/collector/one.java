package com.luopan.stream.collector;

import com.luopan.stream.Dish;
import com.luopan.stream.Dish.CaloricLevel;
import com.luopan.stream.Dish.Type;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author Liq
 * @date 2019/6/13
 */
public class one {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT));
//            new Dish("chicken", false, 400, Dish.Type.MEAT),
//            new Dish("french fries", true, 530, Dish.Type.OTHER),
//            new Dish("rice", true, 350, Dish.Type.OTHER),
//            new Dish("season fruit", true, 120, Dish.Type.OTHER),
//            new Dish("pizza", true, 550, Dish.Type.OTHER),
//            new Dish("prawns", false, 300, Dish.Type.FISH),
//            new Dish("salmon", false, 450, Dish.Type.FISH) );

        System.out.println("====================================");
//
//        // 求最值
//        // 匿名内部类
//        menu.stream().collect(Collectors.maxBy(new Comparator<Dish>() {
//            @Override
//            public int compare(Dish o1, Dish o2) {
//                return o1.getCalories() - o2.getCalories();
//            }
//        }));
//
//        // method reference
//        menu.stream().max(Comparator.comparing(Dish::getCalories));
//        // lambda
//        menu.stream().max((o1, o2) -> o1.getCalories() - o2.getCalories());
//
//        // 最终结果
//        menu.stream().max(Comparator.comparingInt(Dish::getCalories)).ifPresent(System.out::println);
//
//        System.out.println("---------------------------------");
//
//        // 汇总
//        int max = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories)).getMax();
//
//
//        // 最值，平均值
//        IntSummaryStatistics collect = menu.stream()
//            .collect(Collectors.summarizingInt(Dish::getCalories));
//
//        //  广义的规约汇总
//        menu.stream().collect(Collectors.reducing(0,Dish::getCalories,Integer::sum));
//
//
        //  分组
        Map<Dish.Type, List<Dish>> collect1 = menu.stream()
            .collect(Collectors.groupingBy(Dish::getType));

//        // 自定义分组
//        Map<CaloricLevel, List<Dish>> collect2 = menu.stream()
//            .collect(Collectors.groupingBy(dish -> {
//                if (dish.getCalories() <= 400) {
//                    return CaloricLevel.DIET;
//                } else if (dish.getCalories() <= 700) {
//                    return CaloricLevel.NORMAL;
//                } else {
//                    return CaloricLevel.FAT;
//                }
//            }));
//        System.out.println("====================================");
//
//        System.out.println("====================================");
//
        System.out.println("====================================");




        collect1.entrySet().forEach(key-> System.out.println(collect1.get(key)));

    }


}
