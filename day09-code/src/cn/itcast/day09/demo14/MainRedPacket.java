package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("方块龙", 100);

        Member one = new Member("西西卡", 0);
        Member two = new Member("癞疙宝", 0);
        Member three = new Member("黑莓", 0);

        manager.show(); // 100
        one.show(); // 0
        two.show(); // 0
        three.show(); // 0
        System.out.println("=====================");

        // 群主总共发20块钱，分成3个红包
        ArrayList<Integer> redList = manager.send(20, 3);
        // 3个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show(); // 100-20=80
        // 3个红包分别为6、6、8，随机分给三个人
        one.show(); // 6
        two.show(); // 6
        three.show(); // 8
    }

}
