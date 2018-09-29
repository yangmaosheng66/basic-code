package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。

分析：
1.需要创建一个集合，用来存储int数字：<Integer>
2.随机数字就用Random.nextInt()
3.循环20次，把随机数字放入大集合：for循环、add方法
4.定义一个方法，用来进行筛选
    筛选：根据大集合，筛选符合要求的元素，得到小集合。
    三要素：
    返回值类型：ArrayList小集合(里面元素个数不确定)
    方法名称：getEvenNum
    参数列表：ArrayList大集合(装着20个随机数字)
5.判断(if)是偶数，num % 2 == 0
6.如果是偶数，就放到小集合当中，否则不放。
 */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            listA.add(r.nextInt(100) + 1); // 1~100
        }
        System.out.println(listA);

        System.out.println(getEvenNum(listA));
        System.out.println("偶数个数：" + getEvenNum(listA).size());
    }

    //这个方法，接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getEvenNum(ArrayList<Integer> list) { // 传入的是【地址值】
        //创建一个小集合，用来装偶数结果
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                listB.add(list.get(i));
            }
        }
        return listB; // 返回的是【地址值】
    }

}

