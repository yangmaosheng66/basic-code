package cn.itcast.day07.demo02;

import java.util.Scanner;

/*
匿名对象作为方法的参数和返回值
 */
public class Demo02Anonymous {

    public static void main(String[] args) {
        // 普通使用方式
//      Scanner sc = new Scanner(System.in);
//      int num1 = sc.nextInt();

        // 匿名对象的方式
//      int num2 = new Scanner(System.in).nextInt();
//      System.out.println("输入的是：" + num2);

        // 使用一般写法传入参数
//      Scanner sc = new Scanner(System.in);
//      methodParam(sc);

        // 使用匿名对象来进行传参
//      methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {
//      Scanner sc = new Scanner(System.in);
//      return sc;
        return new Scanner(System.in);
    }

}
