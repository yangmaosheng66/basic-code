package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}括起集合，使用@分隔每个元素。
格式参照{元素1@元素2@元素3}

System.out.println(List);   [10, 20, 30]
printArrayList(list);       {10@20@30}
 */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("癞疙宝");
        list.add("大便蛮王");
        list.add("孙笑川");
        list.add("柠檬人");
        System.out.println(list); // [癞疙宝, 大便蛮王, 孙笑川, 柠檬人]

        printArrayList(list);
    }

    /*
    定义方法的三要素：
    返回值类型：只是进行打印而已，没有运算，没有结果，所以用void
    方法名称：printArrayList
    参数列表：ArrayList
     */
    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i == list.size() - 1) {
                System.out.print("}");
            } else {
                System.out.print("@");
            }
        }
    }

}
