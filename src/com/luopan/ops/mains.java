package com.luopan.ops;


import com.sun.istack.internal.NotNull;
import com.sun.media.sound.SoftTuning;
import com.sun.xml.internal.ws.util.StringUtils;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.Spliterator.OfInt;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import sun.plugin.javascript.navig.Array;
import sun.security.util.Length;
import sun.text.resources.is.FormatData_is;

/**
 * @author Liq
 * @date 2019/7/26
 */
public class mains {


    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//
////        test2(nums);
////        int[] ints = twoSum(nums, 13);
////        System.out.println(Arrays.toString(ints));
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
//        map.put(2, 2);
//        map.put(3, 2);
//        map.put(4, 2);
//        map.put(5, 2);
//        map.put(6, 2);
//        String i = "hello";
//        int q = i.hashCode();
//        System.out.println(q);
//        System.out.println("===========");
//        System.out.println(1 << 4);
//        // 1,1  2, 4 3,8 4, 16
//        for (int j = 0; j <9 ; j++) {
//
//        }


//        int[] nums = {1,2,3,4,5,6,7};
//        int[] reverse = reverse(nums);
//        System.out.println(Arrays.toString(reverse));
//
//        char[] s = {'h','e','g'};
//        for (int i = 0; i < s.length / 2; i++) {
//            char temp = s[i];
//            s[i] = s[s.length-i-1];
//            s[s.length-i-1] = temp;
//        }
//        System.out.println(s);
//        int x = -121324;
//        x = -x;
//        System.out.println(x);
//        Integer integer = Integer.valueOf("9");
//        System.out.println(integer);

        String s = "loveleetcode";
//        int i1 = firstUniqChar(s);
        boolean b = 1>2;
        assert b;
        System.out.println("123");



    }

    private static int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])) {
                map.put(chars[i],null);
            } else {
                map.put(chars[i],i);
            }

        }
        Stream<Integer> integerStream = map.entrySet().stream()
            .filter(m -> m.getValue() != null).map(Entry::getValue);
        Optional<Integer> first = integerStream.findFirst();
        return first.orElse(-1);


    }

    private static int[] reverse(int[] nums) {
        for(int i =0; i < nums.length /2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
        return nums;
    }


    private static void test2(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }


}
