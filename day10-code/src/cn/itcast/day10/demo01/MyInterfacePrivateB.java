package cn.itcast.day10.demo01;

public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    // Java 11不能在接口里添加【静态】【私有】方法
    public static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
