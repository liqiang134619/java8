package com.luopan.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * @author Liq
 * @date 2019/7/11
 */
public class tests {


    public static void main(String[] args) {

//        BufferedReader br = new BufferedReader(new FileReader(new File(
//            "D:\\LiQiang\\data\\hotel\\wifi\\样例-wifi\\样例-wifi\\145-757914656-320584-320584-1558323128-53049\\145-320584-1558323128-59301-WA_SOURCE_FJ_0001-0.bcp"
//        )));
//
//        String line = "";
//        line = br.readLine();
//        String[] split = line.split("\\t");
//
//        System.out.println(Arrays.toString(split));
//
//
//
//        br.close();

//        ZipFile zipFile = new ZipFile(
//            "C:\\Users\\Administrator.PC-20180329WRWB\\Desktop\\xx\\145-757914656-320584-320584-1558323128-53041.zip");
//        InputStream in = new BufferedInputStream(new FileInputStream(
//            "C:\\Users\\Administrator.PC-20180329WRWB\\Desktop\\xx\\145-757914656-320584-320584-1558323128-53041.zip"));
//        ZipInputStream zin = new ZipInputStream(in);
//        ZipEntry ze;
//        while ((ze = zin.getNextEntry()) != null) {
//            if(ze.toString().endsWith("bcp")) {
//                BufferedReader br = new BufferedReader(
//                    new InputStreamReader(zipFile.getInputStream(ze)));
//                String line;
//                while ((line = br.readLine()) != null) {
//                    System.out.println(line);
//                }
//                br.close();
//
//                System.out.println();
//            }
//
//        }
//        zin.closeEntry();

        /**********************final****************************/
//        method1();
        method2();


    }

    private static void method2() {
        String[] s = {"hello","word","123","234"};
        String[] s1 = new String[5];
        System.arraycopy(s,0,s1,0,4);
        System.out.println(Arrays.toString(s1));
        System.out.println(s1[4]);

    }

    private static void method1() {
        try {
            File file = new File("C:\\Users\\Administrator.PC-20180329WRWB\\Desktop\\xx\\");
            File[] listFiles = file.listFiles();
            assert listFiles != null;
            for (File file1 : listFiles) {
                ZipFile zipFile = new ZipFile(file1);
                InputStream in = new BufferedInputStream(new FileInputStream(file1));
                ZipInputStream zin = new ZipInputStream(in);
                ZipEntry ze;
                while ((ze = zin.getNextEntry()) != null) {
                    if (ze.toString().endsWith("bcp")) {
                        BufferedReader br = new BufferedReader(
                            new InputStreamReader(zipFile.getInputStream(ze)));
                        String line;
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                        br.close();
                        System.out.println("===============================");
                    }
                }
                zin.closeEntry();
                zin.close();
                in.close();
                zipFile.close();
                // 删除文件
                if(file1.delete()) {
                    System.out.println("success!");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
