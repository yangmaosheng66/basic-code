package cn.itcast.day09.demo14;

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("方块龙", 100);
        Member one = new Member("西西卡", 0);
        Member two = new Member("癞疙宝", 0);
        Member three = new Member("黑莓", 0);

        manager.show();
        one.show();
        three.show();
        System.out.println("=============");
    }

}
