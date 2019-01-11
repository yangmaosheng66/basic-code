package cn.itcast.day09.demo07;

public class Zi extends Fu {

    public Zi() {
//        super(); // 调用父类无参构造方法，不写则编译器赠送一个
        super(20); // 在调用父类重载的有参构造方法
        System.out.println("子类构造方法！");
    }

    public void method() {
//        super(); // 错误写法！只有【子类构造】方法，才能调用【父类构造】方法
    }

}
