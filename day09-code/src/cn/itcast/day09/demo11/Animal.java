package cn.itcast.day09.demo11;

/*
抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束。
抽象类：【抽象方法】所在的类，必须是【抽象类】才行。在class之前写上abstract即可。

如何使用抽象类和抽象方法：
1.不能直接创建new抽象类对象。
2.必须用一个子类来【继承】抽象父类。
3.子类必须【覆盖重写】抽象父类当中【所有】的【抽象方法】。
    即 覆盖重写（实现）：子类【去掉】抽象方法的abstract关键字，然后补上方法体大括号。
4.创建子类对象进行使用。
 */
public abstract class Animal {

    // 这是一个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定
    public abstract void eat();

//    // 这是【普通】的成员方法
//    public void normalMethod() {
//    }

}
