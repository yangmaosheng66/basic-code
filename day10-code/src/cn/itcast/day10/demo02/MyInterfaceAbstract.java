package cn.itcast.day10.demo02;

public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {

    }

    // 如果没有覆盖重写接口的所有抽象方法，则实现类也要是抽象类
//    @Override
//    public void methodB() {
//
//    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {

    }

}
