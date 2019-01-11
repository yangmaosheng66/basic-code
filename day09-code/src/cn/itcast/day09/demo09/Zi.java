package cn.itcast.day09.demo09;

/*
super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：

1.在【本类】的【成员方法】中，访问【本类】的【成员变量】。
2.在本类的成员方法中，访问本类的另一个成员方法。
3.在本类的构造方法中，访问本类的另一个构造方法。
    注意：this(...)调用也必须是构造方法的第一个语句，唯一一个。
          super和this两种构造调用，不能同时使用。
 */
public class Zi extends Fu {

    int num = 20;

    public Zi() {
//        super(); // 错误写法！第一个语句调用子类有参构造，父类构造调用不再赠送。
        this(5); // 本类的无参构造，调用本类的有参构造
    }

    public Zi(int num) {
        super(); // 正确写法！无参调有参，有参调父类构造。不写则赠送
//        this(); // 错误写法！构造方法不能循环调用
        this.num = num;
    }

    public void showNum() {
        int num = 10;
        System.out.println(num); // 局部变量
        System.out.println(this.num); // 本类中的成员变量
        System.out.println(super.num); // 父类中的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        System.out.println("BBB");
        this.methodA();
        methodA(); // 本类成方访问本类成方时，this关键字可不写，起到强调作用
    }

}
