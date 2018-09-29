package cn.itcast.day07.demo04;

/*
题目：
定义一个数组，用来存储3个Person对象。

数组有一个缺点：一旦创建。程序运行期间长度不可以发生改变。
 */
public class Demo01Array {

    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("癞疙宝",24);
        Person two = new Person("大便蛮王",30);
        Person three = new Person("孙笑川",35);

        //将one当中的【地址值】赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); // 地址值
        System.out.println(array[1]); // 地址值
        System.out.println(array[2]); // 地址值

        System.out.println(array[1].getName()); // 大便蛮王
    }

}
