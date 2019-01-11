package cn.itcast.day09.demo07;

/*
继承关系中，父子类构造方法的访问特点：

1.子类构造方法当中有一个默认隐含的“super();”调用，所以一定是【先调用】的【父类构造】，后执行的子类构造。
2.子类构造可以通过super关键字来调用父类的重载构造
3.super的父类构造调用，必须是【子类】【构造方法】的【第一个】语句。不能一个子类构造调用多次super构造。

注意事项：
子类构造方法【必须】调用父类构造方法，不写则赠送super()；写了则用写的指定的super调用，super只能有一个，还必须是第一个。
 */
public class Demo01Constructor {

    public static void main(String[] args) {
        Zi zi = new Zi();
    }

}
