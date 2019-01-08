package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中存储基本数据类型，必须使用基本类型对应的“包装类”。

基本类型    包装类(引用类型，包装类都位于java.lang包下，不需导包)
byte        Byte
short       Short
int         Integer   *
long        Long
float       Float
double      Double
char        Character *
boolean     Boolean

从JDK 1.5+ 开始，支持自动装箱、自动拆箱。

自动装箱，基本类型 --> 包装类型
自动拆箱，包装类型 --> 基本类型
 */
public class Demo05ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC); // [100, 200]

        int num = listC.get(1); // 可以用【基本类型】接收对应的【包装类型】，即自动拆箱
        System.out.println("第1号元素是：" + num); // 第1号元素是：200
    }

}
