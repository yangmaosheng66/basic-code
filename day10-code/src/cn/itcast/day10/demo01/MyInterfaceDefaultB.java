package cn.itcast.day10.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() { // 实现类覆盖重写接口的默认方法时【没有】default关键字
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
