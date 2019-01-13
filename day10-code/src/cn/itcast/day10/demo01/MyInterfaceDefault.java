package cn.itcast.day10.demo01;

/*
从Java 8开始，接口里允许定义默认方法。
格式：
public default 返回值类型 方法名称(参数列表) {
    方法体
}

备注：1.接口当中的【默认方法】，可以解决【接口升级】的问题。
     2.当之后学习到【lambda表达式】和【函数式编程】时，接口的【默认方法】可以【拼接函数模型】。
 */
public interface MyInterfaceDefault {

    // 抽象方法
    public abstract void methodAbs();

    // 新添加了一个抽象方法，所有实现类都要【覆盖重写】该方法，不方便
//    public abstract void methodAbs2();

    // 新添加的方法，改成【默认方法】
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }

}
