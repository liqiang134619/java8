package com.luopan.collect;

import com.luopan.stream.Dish;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Liq
 * @date 2019/8/20
 */
public class Liqun {

    public static void main(String[] args) {
//        List<Dish> menu = Arrays.asList(
//            new Dish("pork", false, 800, Dish.Type.MEAT),
//            new Dish("beef", false, 700, Dish.Type.MEAT),
//            new Dish("chicken", false, 400, Dish.Type.MEAT),
//            new Dish("french fries", true, 530, Dish.Type.OTHER),
//            new Dish("rice", true, 350, Dish.Type.OTHER),
//            new Dish("season fruit", true, 120, Dish.Type.OTHER),
//            new Dish("pizza", true, 550, Dish.Type.OTHER),
//            new Dish("prawns", false, 300, Dish.Type.FISH),
//            new Dish("salmon", false, 450, Dish.Type.FISH) );
//        System.out.println("=============begin==============");

     /*   // 1.把流中的项目收集到list中
        List<String> collect = menu.stream().map(Dish::getName).collect(Collectors.toList());
        //2. 把流中项目收集到set中
        Set<String> set = menu.stream().map(Dish::getName).collect(Collectors.toSet());
        // 3.把流中收集到集合中
        ArrayList<String> arrayList = menu.stream().map(Dish::getName)
            .collect(Collectors.toCollection(ArrayList::new));
        // 4. 计算流中元素的个数
        Long aLong = menu.stream().collect(Collectors.counting());
        //5. 流中某一个整数求和
        Integer collect1 = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        Integer collect2 = menu.stream().mapToInt(Dish::getCalories).sum();
        //6 .对流中所有项目调用tostring生成字符串
        String s = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
//        s = "prok,beef,checken...."
        // 7.包裹流中最大元素, maxBy, minBy
        Optional<Dish> optional = menu.stream()
            .collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)));
        Optional<Dish> optiona2 = menu.stream().max(Comparator.comparingInt(Dish::getCalories));
        // 8.规约操作，从一个累加器的初始值开始，利用BinaryOperator与流中元素逐个集合，从而将流规约为单值
        Integer integer = menu.stream()
            .collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
        Integer integer2 = menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
        // 9. 包裹另一个收集器，对结果应用转换函数
        Integer collect3 = menu.stream()
            .collect(Collectors.collectingAndThen(Collectors.toList(), List::size));

        ArrayList<Dish> dishes = menu.stream().collect(Collectors
            .collectingAndThen(Collectors.toCollection(TreeSet::new), ArrayList::new));

*/
//        Stream<Integer> integerStream = menu.stream().map(Dish::getCalories);
//        StringBuilder sb = new StringBuilder();
//        integerStream.forEach(integer -> {
//            sb.append(integer.toString());
//            sb.append(",");
//        });
//        String substring = sb.substring(0, sb.lastIndexOf(","));
//        System.out.println(substring);
//        System.out.println("==================");
//        double rates = 100;
//        double value = BigDecimal.valueOf(rates).setScale(2, BigDecimal.ROUND_HALF_UP)
//            .doubleValue();
//        System.out.println(value);

//        double b = 0;
//        String s = Double.toString(b);
//        System.out.println(s);
//        for (int i = 0; i < 100; i++) {
//            double random = Math.random();
//            double d = random * 1000000;
//            String s = String.valueOf(d);
//            System.out.println(s);
//        }
//        String s = "20190822";
//        LocalDate now = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyyMMdd")).minusDays(1L);
////        LocalDateTime now = LocalDateTime.now().minusDays(1L);
//
//
//
//        LocalDateTime yesterday = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 14, 0, 0);
//        LocalDateTime theDayBefore = yesterday.minusDays(1L);
//
//
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
//
//
//        String endTime = yesterday.format(dateTimeFormatter);
//        String startTime = theDayBefore.format(dateTimeFormatter);
//        System.out.println("【==> 超限任务开始时间:{}】"+startTime);
//        System.out.println("【==> 超限任务结束时间:{}】"+endTime);
//        System.out.println(yesterday);
//        System.out.println(theDayBefore);


//        menu.stream().forEach(dish -> {
//            System.out.println(dish);
//            for (int i = 0;i < 4; i++) {
//                System.out.println(i);
//                if(i == 2){
//                    break;
//                }
//            }
//        });





    }

}
