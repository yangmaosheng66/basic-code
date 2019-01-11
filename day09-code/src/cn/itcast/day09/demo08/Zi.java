package cn.itcast.day09.demo08;

/*
super关键字的用法有三种：
1.在子类的【成员方法】中，访问父类的【成员变量】。
2.在子类的【成员方法】中，访问父类的【成员方法】。
3.在子类的【构造方法】中，访问父类的【构造方法】。
 */
public class Zi extends Fu {

    int num = 20;

    public Zi() {
        super(); // 子类的构造器访问父类的构造器
    }

    public void methodZi() {
        System.out.println(super.num); // 父类中的num
    }

    public void method() {
        super.method(); // 访问父类中的method
        System.out.println("子类方法");
    }

}
