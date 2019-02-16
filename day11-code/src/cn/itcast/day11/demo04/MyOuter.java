package cn.itcast.day11.demo04;

/*
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】。

备注：从Java 8+开始，只要局部变量事实不变，那么final关键字可以省略。
Variable 'num' is accessed from within inner class, needs to be 【final】 or 【effectively final】

原因：
1.new出来的对象在【堆】内存当中。
2.局部变量是跟着方法走的，在【栈】内存当中。
3.方法运行结束之后，立刻出栈，局部变量就会立刻消失。
4.new出来的对象会在堆当中【持续存在】，直到垃圾回收后消失。
    所以，【对象】比【局部变量】的生命周期【长】，【内部类对象】使用【局部变量】时会copy
    一份该局部变量的【值】，以便当局部变量【消失】后再使用它。因此，局部变量【不能】二次赋值。
 */
public class MyOuter {

    public void methodOuter() {
        int num = 10; // 所在方法的局部变量
//        num = 20; // 不能二次赋值

        class MyInner {
            public void methodInner() {
                System.out.println(num); // 10
            }
        }
    }

}
