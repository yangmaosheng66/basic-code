package cn.itcast.day10.demo05;

/*
访问成员变量的两种方式：

1.直接通过【对象名称】访问【成员变量】：看【等号】【左边】是谁，优先用谁，没有则【向上】找。
2.间接通过【成员方法】访问【成员变量】：看【该方法】【属于谁】，优先用谁，没有则【向上】找。
 */
public class Demo01MultiField {

    public static void main(String[] args) {
        // 使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num); // 10 等号左边是Fu类，就是Fu类的num
//        System.out.println(obj.age); // 错误写法！因为【等号】【左边】的【Fu】类没有age变量。
        System.out.println("=============");

        // 10 子类没有覆盖重写，showNum()属于obj，是Zi类对象，向上找就是Fu类的num
        // 20 子类如果覆盖重写，showNum()属于obj，是Zi类对象，就是Zi类的num
        obj.showNum();
    }

}
