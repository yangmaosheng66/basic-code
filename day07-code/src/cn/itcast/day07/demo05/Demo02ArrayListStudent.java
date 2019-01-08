package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
题目：
定义四个学生对象，添加到集合，并遍历。

思路：
1.自定义Student学生类，四个部分。
2.创建一个集合，用来存储学生对象。泛型：<Student>
3.根据类，创建4个学生对象。
4.将4个学生对象添加到集合中：add
5.遍历集合：for、size、get
 */
public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("癞疙宝",24);
        Student stu2 = new Student("大便蛮王",25);
        Student stu3 = new Student("孙笑川",30);
        Student stu4 = new Student("柠檬人",35);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " +list.get(i).getAge());
        }

        System.out.println(list); // 地址值 [地址值1, 地址值2, 地址值3, ...]
        System.out.println(list.get(0)); // 地址值 cn.itcast.day07.demo05.Student@6e8dacdf
    }

}
