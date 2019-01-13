package cn.itcast.day10.demo01;

/*
接口的实现类命名习惯：
接口的名称 + Impl    （Impl是Implements的简写）
 */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {

    @Override
    public void methodAbs1() {
        System.out.println("这是第一个方法！");
    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第二个方法！");
    }

    @Override
    public void methodAbs3() {
        System.out.println("这是第三个方法！");
    }

    @Override
    public void methodAbs4() {
        System.out.println("这是第四个方法！");
    }

}
