package cn.itcast.day06.demo02;

public class Demo05PhoneReturn {

    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "玫瑰金";
        return one; // 谁调用了我，我就把one的地址值交给谁
    }

}
