package cn.itcast.day09.demo13;

// 【子类】也是一个【抽象类】
public abstract class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

//    public abstract void sleep();

}
