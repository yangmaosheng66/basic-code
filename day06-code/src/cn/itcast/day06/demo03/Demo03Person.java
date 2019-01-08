package cn.itcast.day06.demo03;

public class Demo03Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "癞疙宝";
//      person.age = -24; // 直接访问private内容，错误写法！
        person.setAge(-24);
        person.show();
    }

}
