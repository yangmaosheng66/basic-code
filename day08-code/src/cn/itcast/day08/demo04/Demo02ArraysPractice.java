package cn.itcast.day08.demo04;

import java.util.Arrays;
import java.util.Scanner;

/*
题目：
请使用Arrays相关API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysPractice {

    public static void main(String[] args) {
        String str = new Scanner(System.in).next(); // 输入随机字符串
        upDown(str);
    }

    public static void upDown(String str) {
        // 如何进行升序排列：sort
        // 必须是一个数组，才能用Array.sort()方法
        // String --> 数组，用toCharArray()方法
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // 对字符数组进行升序排列

        System.out.println("倒序打印：");
        // 需要【倒序】遍历
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
    }

}
