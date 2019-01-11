package cn.itcast.day09.demo13;

public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // 错误写法！抽象类不能创建对象

//        Dog dog = new Dog(); // 错误写法！这也是个抽象类

        DogHusky dogHusky = new DogHusky(); // 这是普通类，可以直接new对象
        dogHusky.eat();
        dogHusky.sleep();
        System.out.println("============");

        DogGolden dogGolden = new DogGolden();
        dogGolden.eat();
        dogGolden.sleep();
    }

}
