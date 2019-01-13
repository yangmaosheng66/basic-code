package cn.itcast.day10.demo01;

/*
1.接口的【默认方法】，可以通过【接口实现类对象】，直接【调用】。
2.接口的【默认方法】，也可以被【接口实现类】进行【覆盖重写】。
 */
public class Demo02Interface {

    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); // 调用抽象方法，实际运行的是右侧实现类

        // 调用默认方法，如果实现类中没有，就会向上找接口有没有
        a.methodDefault(); // 这是新添加的默认方法
        System.out.println("===================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs(); // 实现了抽象方法，BBB
        b.methodDefault(); // 实现类B覆盖重写了接口的默认方法
    }
    
}
