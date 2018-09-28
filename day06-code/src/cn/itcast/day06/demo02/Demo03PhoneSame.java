package cn.itcast.day06.demo02;

public class Demo03PhoneSame {

    public static void main(String[] args) {
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
        System.out.println("====================");

        //将one当中保存的对象地址赋值给two
        Phone two = one; // 两个对象名称指向了同一个对象，对象的名称也叫对象的引用名
        System.out.println(two.brand); // Apple
        System.out.println(two.price); // 8388.0
        System.out.println(two.color); // 深空灰
        System.out.println("===========");

        two.brand = "Mi";
        two.price = 2799.0;
        two.color = "蓝色";
        System.out.println(two.brand); // Mi
        System.out.println(two.price); // 2799.0
        System.out.println(two.color); // 蓝色
        System.out.println("===========");

        two.call("LeiJun"); // 给LeiJun打电话
        two.sendMessage(); // 群发短信
    }

}
