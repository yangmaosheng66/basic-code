package cn.itcast.day06.demo02;

/*
方法进入栈中执行：入栈/压栈
方法执行完毕立刻出栈/弹栈，出栈后下一个方法入栈
 */
public class Demo01PhoneOne {

    public static void main(String[] args) {
        //根据Phone类，创建一个one的对象
        //格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("===========");

        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "深空灰";
        System.out.println(one.brand); // Apple
        System.out.println(one.price); // 8388.0
        System.out.println(one.color); // 深空灰
        System.out.println("===========");

        one.call("Jobs"); // 给Jobs打电话
        one.sendMessage(); // 群发短信
    }

}
