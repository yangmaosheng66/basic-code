package cn.itcast.day10.demo01;

/*
注意事项：【不能】通过接口实现类的【对象】来调用【接口】当中的【静态方法】。（与普通类的静态方法调用方式不同）
正确用法：通过【接口名称】，【直接调用】其中的【静态方法】。
格式：
接口名称.静态方法名(参数);
 */
public class Demo03Interface {

    public static void main(String[] args) {
        // 创建了实现类对象，只调用静态方法的话则不需要创建
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        // 错误写法！不能通过接口实现类的对象调用接口的静态方法
//        impl.methodStatic();

        // 直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }

}
