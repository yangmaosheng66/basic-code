package cn.itcast.day10.demo06;

/*
instance:
n.实例；例子；事例
v.举…为例
网络：例证；实体；个体

如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象名 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例。
 */
public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal animal = new Cat(); // 本来是一只猫
        animal.eat(); // 猫吃鱼

        // 如果希望调用子类特有方法，需要向下转型
        // 判断一下父类引用animal本来是不是Dog类型
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        // 判断一下父类引用animal本来是不是Cat类型
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse(); // 猫抓老鼠
        }

        // 调用方法，给了一只狗
        giveMeAPet(new Dog());
    }

    // 该方法接收一个Animal类型的对象，猫、狗都行
    // 如果想要使用这个对象的特有方法
    // 就要向下转型才能使用
    // 所以要先判断这个传入的对象本来是什么子类型
    public static void giveMeAPet(Animal animal) {
        // 判断一下传进来的参数——父类引用animal本来是不是Dog类型
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse(); // 狗看家
        }
        // 判断一下传进来的参数——父类引用animal本来是不是Cat类型
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }

}
