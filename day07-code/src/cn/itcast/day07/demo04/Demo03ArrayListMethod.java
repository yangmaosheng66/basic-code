package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
ArrayList当中的常用方法有：

Public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
    备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
          但是对于其他集合(今后学习)来说，add添加的动作不一定成功。

public E get(int index)：从集合当中获取元素，参数就是索引编号，返回值就是对应位置的元素。

public E remove(int index)：从集合当中删除元素，参数就是索引编号，【返回值】就是【被删除掉的元素】。

public int size()：获取集合的尺寸长度，返回值是集合中包含的【元素个数】。
 */
public class Demo03ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        //向集合中添加元素：add
        boolean success = list.add("癞疙宝");
        System.out.println(list); // [癞疙宝, 大便蛮王, 孙笑川]
        System.out.println("添加的动作是否成功：" + success); // true

        list.add("大便蛮王");
        list.add("孙笑川");
        list.add("激光笔");
        System.out.println(list); // [癞疙宝, 大便蛮王, 孙笑川, 激光笔]

        //从集合中获取元素：get，索引值从【0】开始
        String name = list.get(2);
        System.out.println("第2号索引位置：" + name);

        //从集合中删除元素，remove，索引值从【0】开始
        String whoRemoved = list.remove(1);
        System.out.println("被删除的人是：" + whoRemoved);
        System.out.println(list);

        //获取集合的长度尺寸，也就是其中【元素的个数】
        int size = list.size();
        System.out.println("集合的长度是：" + size);

    }

}
