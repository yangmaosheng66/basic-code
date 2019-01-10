package cn.itcast.day09.demo04;

/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
    创建（即new）的对象是谁，就优先用谁，如果没有则向上找。

注意事项：
无论是【成员方法】还是【成员变量】，如果没有都是向上找【父类】，绝对不会向下找子类。

重写（Override）
概念：在继承关系当中，方法的【名称】一样，【参数列表】也一样。

重写（Override）：方法的【名称】【一样】，【参数列表】也【一样】。也叫 覆盖、覆写、覆盖重写
重载（Overload）：方法的【名称】【一样】，【参数列表】【不一样】。

方法的【覆盖重写】特点：创建的是【子类对象】，则优先用【子类方法】。
 */
public class Demo01ExtendsMethod {

    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFu();
        zi.methodZi();

        // 创建的是new了子类对象，所以优先用子类方法
        zi.method();
    }

}
