package cn.itcast.day09.demo10;

public class Zi extends Fu {

    int num = 20;

    @Override
    public void method() {
        super.method(); // 调用了父类成员方法
        System.out.println("子类方法");
    }

    public void show() {
        int num = 30;
        System.out.println(num); // 30 局部变量
        System.out.println(this.num); // 20 子类成员变量
        System.out.println(super.num); // 10 父类成员变量
    }

}
