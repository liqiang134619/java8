package com.luopan;


import com.luopan.da.Ob;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.SortedMap;
import java.util.function.Function;
import org.apache.commons.io.FileUtils;
import sun.print.SunMinMaxPage;

/**
 * @author Liq
 * @date 2019/6/5
 */
public class main {

    public static void main(String[] args) throws IOException {

//        List<String> str = Arrays.asList("2001-10-22","2001-10-23","2001-11-22");
//
//        for (String s : str) {
//            String[] split = s.split("-");
//
//        }

        // 1.匿名类
//        str.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int i = o1.compareTo(o2);
//                return -i;
//            }
//        });
//        Date date = new Date(2211, 10, 11);
//        Date date1 = new Date(2211, 11, 11);
//        long time = date.getTime();
//        long time1 = date1.getTime();
//        System.out.println(time);
//        System.out.println(time1);
//        System.out.println(time1 - time);

//        Date date2 = new Date(2211, 9, 11);
//
//        Ob ob = new Ob(date);
//        Ob ob1 = new Ob(date1);
//        Ob ob2 = new Ob(date2);
//
//        List<Ob> list = Arrays.asList(ob, ob1, ob2);
//        list.sort(Comparator.comparing(Ob::getDateTime).reversed());
//
//        System.out.println(list);

//        // 2. lambda表达式
//        str.sort((s1,s2) -> s1.compareTo(s2));
//        str.sort((s1,s2) -> {return s1.compareTo(s2);});
//
//        str.sort(Comparator.comparing(String::toString).reversed());
//
//
//        // 3 方法引用
//        str.sort(String::compareTo);
//        System.out.println("------------------");
//        str.stream().sorted(String::compareTo).sorted().forEach(System.out::println);
//        str.stream().sorted(String::compareTo).forEach(System.out::println);

//        str.forEach(System.out::println);



//        String s = "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";
//        byte[] decode = Base64.decode(s);
//
//        FileUtils.writeByteArrayToFile(new File("/usr/local/data/","a.jpg"),decode);
//
//        File file = new File("/usr/local/data/","a.jpg");
//
//        long length = file.length();
//
//        System.out.println(length);
//
//        String s = "2019-07-21 12:00:00";
//        String substring = s.substring(0, 11);
//        System.out.println(substring);
//        String replace = substring.replace("-", "");
//        System.out.println(replace);

//        String s1 = null;
//        String s2 = null;
//
//        if(s1 !=null) {
//            System.out.println("--");
//        } else if (s2 != null) {
//            System.out.println("==");
//        } else {
//            System.out.println("=========");
//        }

//        int [] nums = {0,0,1,1,1,2,2,3,3,4};
//
//        for (int i = nums.length - 2; i >= 0 ; i--) {
//            for(int j = nums.length - 1; j > i;j-- ) {
//                if(nums[j] == nums[i]) {
//                    for(int k = )
//                }
//            }
//        }


//        System.out.println(Arrays.toString(nums));

//        int[] in = new int[9];
//        for (int i = 1; i < 5 ; i++) {
//            in[i] = i;
//        }
//        for (int i : in) {
//            System.out.println(i);
//        }

//
//        int[] nums = {6,1,3,2,4,7};
//        int i = maxProfit(nums);
//        System.out.println(i);



        int[] s ={1,3,6,5,3,5,0,8,8,2,12};
        int[] f ={4,5,10,7,8,9,6,11,12,13,14};

        boolean[] mark = new boolean[11];

        GreedyChoose(11,s,f,mark);
        for (int i = 0; i < mark.length; i++) {
            if(mark[i]) {
                System.out.print(i+ " ");
            }
        }



    }

    private static void GreedyChoose(int len, int[] s, int[] f, boolean[] mark) {
        mark[0] = true;
        int j = 0;
        for(int i=1;i<len;++i) {
            if(s[i] >= f[j])
            {
                mark[i] = true;
                j = i;
            }
        }

    }

//    public static int maxProfit(int[] prices) {
//        boolean f = false;
//        for(int i = 0; i < prices.length - 1; i++) {
//            if(prices[i] > prices[i+1]) {
//                continue;
//            } else {
//                f = true;
//                break;
//            }
//        }
//        if(!f) {
//            return 0;
//        }
//        boolean flag = false;
//        for(int i = 0; i < prices.length - 1; i++) {
//            if(prices[i] < prices[i+1]) {
//                continue;
//            } else {
//                flag = true;
//                break;
//            }
//        }
//        if(!flag) {
//            return prices[prices.length - 1] - prices[0];
//        }
//        int sum = 0;
//        for(int i = 0; i < prices.length; i++) {
//            sum += prices[i];
//        }
//        int avg = sum / prices.length;
//
//        int total = 0;
//        int[] in = new int[prices.length];
//        int[] out = new int[prices.length];
//        int p = 0;
//        int k = 0;
//        int y = 0;
//
//
//        for(int i= 0; i < prices.length; i ++) {
//            if(prices[i] < avg) {
//                y = i;
//                break;
//            }
//        }
//
//        for(int i = y; i < prices.length; i++) {
//            if(prices[i] < avg) {
//                in[p]= prices[i];
//                p++;
//                continue;
//            }
//            if(prices[i] > avg) {
//                out[k] = prices[i];
//                k++;
//            }
//
//        }
//
//        for(int i = 0; i < prices.length; i++){
//            if(out[i] == 0 || in[i] == 0) {
//                break;
//            }
//            total += out[i] - in[i];
//
//        }
//        return total;
//
//
//    }


}
