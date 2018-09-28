package cn.itcast.day06.demo02;

public class Demo04PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "土豪金";

        method(one); // 传递进去的参数其实就是地址值
    }

    public static void method(Phone param){
        System.out.println(param.brand); // Apple
        System.out.println(param.price); // 8388.0
        System.out.println(param.color); // 土豪金
    }

}
