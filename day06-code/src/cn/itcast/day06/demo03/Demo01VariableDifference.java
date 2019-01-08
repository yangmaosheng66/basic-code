package cn.itcast.day06.demo03;

/*
局部变量和成员变量

1.定义的位置不一样【重点】
    局部变量：在方法的内部
    成员变量：在方法的外部，直接写在类当中

2.作用范围不一样【重点】
    局部变量：只有方法当中才可以使用，出了方法就不能再用
    成员变量：整个类全都可以通用

3.默认值不一样【重点】
    局部变量：【没有默认值】，如果想要使用，必须手动进行赋值
    成员变量：如果没有赋值，会【有默认值】，规则和数组一样

4.内存的位置不一样（了解）
    局部变量：位于栈内存
    成员变量：位于堆内存

5.生命周期不一样（了解）
    局部变量：随着【方法进栈】而诞生，随着【方法出栈】而消失        （一般较短）
    成员变量：随着【对象创建】而诞生，随着【对象被垃圾回收】而消失   （一般较长）
 */
public class Demo01VariableDifference {

    String name; // 成员变量

    public void method() {
        int num = 20; // 局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param) { // 方法的参数就是【局部变量】
        // 参数在方法调用的时候，必然会被赋值的
        System.out.println(param);

        int age; // 局部变量 没有默认值
//      System.out.println(age); // 没赋值，不能用
//      System.out.println(num); // 错误写法！
        System.out.println(name);
    }

}
