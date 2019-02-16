package cn.itcast.day11.demo06;

public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        // 为英雄起一个名字，并且设置年龄
        hero.setName("盖伦");
        hero.setAge(24);

        // 创建一个武器对象
        Weapon weapon = new Weapon("暴风大剑");
        // 为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack(); // 年龄为24的盖伦正在用暴风大剑攻击敌方
    }

}
