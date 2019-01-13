package cn.itcast.day10.demo05;

/*
在多态的代码当中，成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找。

口诀：编译看左边，运行看右边。【成员变量不适用】（编译：只要IDE不出红线，就是编译通过）

对比一下：
成员【变量】：【编译】看【左】边，【运行】还看【左】边。
成员【方法】：【编译】看【左】边，【运行】看【右】边

注意事项：
【向上】转型的多态new写法中，【子类特有】的方法【不能】通过【对象名.方法名】访问，需要将对象【向下】转型。
举例：
Animal animal = new Husky();
animal.destroy(); // 子类特有方法 错误写法
一只二哈要拆家，但是动物不一定要拆家。因为对象animal的类型是Animal类，代码把对象animal当作Animal类来对待。
解决方案：将对象animal向下转型。
 */
public class Demo02MultiMethod {

    public static void main(String[] args) {
        // 编译看左边，运行看右边【看左看右是在多态的new中看的】
        Fu obj = new Zi(); // 多态

        obj.method(); // 子类方法   父子都有，优先用子
        obj.methodFu(); // 父类特有方法   子类没有，父类有，向上找到父类

        // 编译看左，左边是Fu类，Fu类当中没有methodZi方法，所以编译报错
//        obj.methodZi(); // 错误写法！

    }

}
