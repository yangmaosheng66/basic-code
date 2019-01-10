package cn.itcast.day08.demo03;

/*
静态代码块的格式是：

public class 类名称 {
    static {
        // 静态代码块的内容
    }
}

特点：当【第一次】用到本类时，静态代码块执行【唯一的一次】。
【静态】内容总是【优先】于【非静态】内容，所以静态代码块比构造方法【先】执行.

静态代码块的典型用途：
用来【一次性】地对【静态成员变量】进行【赋值】。
 */
public class Demo04Static {

    public static void main(String[] args) {
        Person one = new Person();
        System.out.println("===============");

        Person two = new Person();
    }

}
