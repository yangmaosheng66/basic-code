package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
java.util.Arrays是一个与【数组】相关的工具类，里面提供了大量【静态】方法，用来用来实现数组常见的操作。

public static String toString(数组)：将参数数组变成【字符串】（按照默认格式：[元素1, 元素2, 元素3, ...]）
public static void sort(数组)：按照默认【升序】（从小到大）对数组的元素进行【排序】。

备注：
1.如果是【数值】，sort()默认按照【升序】（从小到大）
2.如果是【字符串】，sort()默认按照【英文字母升序】（a~z），（汉字则按照ASCII升序）
3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者comparator接口的支持。（今后学习）
 */
public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        // 将int[]数组按照默认格式变成【字符串】
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr); // [10, 20, 30]

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1); // 排序后还把元素放入【本来的数组】
        System.out.println(Arrays.toString(array1)); // [1, 2, 3, 6, 10]

        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); // [aaa, bbb, ccc]
    }

}
