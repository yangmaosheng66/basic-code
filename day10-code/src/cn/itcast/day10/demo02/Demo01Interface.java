package cn.itcast.day10.demo02;

/*
使用接口的时候，需要注意：

1.接口是没有【静态代码块】或者【构造方法】的。
2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
格式：
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    // 覆盖重写所有抽象方法
}
3.如果实现类所实现的多个接口当中，存在【重复】的【抽象方法】，那么只需要覆盖重写一次即可。
4.如果实现类没有覆盖重写【所有】接口当中的【所有】抽象方法，那么实现类就必须是一个抽象类。
5.如果实现类所实现的多个接口当中，存在【重复】的【默认方法】，那么实现类一定要对冲突的默认方法进行覆盖重写。
6.一个类如果【直接父类】当中的方法，和【接口】当中的【默认方法】产生了冲突，则优先用【父类】当中的方法。
 */
public class Demo01Interface {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }

}
