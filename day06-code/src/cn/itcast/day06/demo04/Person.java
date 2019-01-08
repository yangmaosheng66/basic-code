package cn.itcast.day06.demo04;

/*
当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量。
如果需要访问【本类】当中的【成员变量】，需要使用格式：
this.成员变量名

“通过谁(对象)调用的方法，谁就是this”
 */
public class Person {

    String name; // 我自己的名字

    // 参数who是对方的名字
    // 成员变量name是自己名字
    public void sayHello(String name) {
        System.out.println(name + "，你好。我是" + this.name);
        System.out.println(this); // person的地址值，this可以等同于person（即对象名称）
    }

}
