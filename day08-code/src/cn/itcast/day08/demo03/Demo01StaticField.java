package cn.itcast.day08.demo03;

/*
成员变量（类属性）：field

如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 */
public class Demo01StaticField {

    public static void main(String[] args) {
        Student.room = "101教室"; // 正确，推荐

        Student one = new Student("癞疙宝", 24);
//        one.room = "101教室"; // 正确，不推荐
        System.out.println("姓名：" + one.getName()
                + "，年龄：" + one.getAge() + "，教室：" + one.room
                + "，学号：" + one.getId());

        Student two = new Student("方块龙", 30);
        System.out.println("姓名：" + two.getName()
                + "，年龄：" + two.getAge() + "，教室：" + two.room
                + "，学号：" + two.getId());

        System.out.println(Student.room); // 静态成员方法也可以通过类名称调用
    }

}
