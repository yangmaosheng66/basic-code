package cn.itcast.day08.demo02;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他

思路：
1.既然用到键盘输入，肯定是Scanner
2.键盘输入的是字符串，那么：String str = sc.next();
3.定义四个变量，分别代表四种字符各自的出现次数。
4.需要对字符串一个字、一个字检查，String --> char[]，方法就是toCharArray()
5.遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++操作。
6.打印输出4个变量，分别代表四种字符出现次数。

注意事项;
1.byte/short/char这三种类型都可以发生数学运算，例如“+”、“>=”、“==”
2.byte/short/char这三种类型在运算的时候，都会被首先提升成为int类型（即ASCII码表），然后再计算
3.boolean类型不能发生数据类型转换
 */

import java.util.Scanner;

public class Demo07StringCount {

    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        count(new Scanner(System.in).next());
    }

    public static void count(String str) {
        int countCapital = 0; // 大写字母
        int countLowercase = 0; // 小写字母
        int countFigure = 0; // 数字
        int countOther = 0; // 其他字符

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            // 用逻辑运算符比较时变量尽量中间对称
            if ('A' <= ch[i] && ch[i] <= 'Z') {
                countCapital++;
            } else if ('a' <= ch[i] && ch[i] <= 'z') {
                countLowercase++;
            } else if ('0' <= ch[i] && ch[i] <= '9') {
                countFigure++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母：" + countCapital);
        System.out.println("小写字母：" + countLowercase);
        System.out.println("数字：" + countFigure);
        System.out.println("其他：" + countOther);
    }

}
