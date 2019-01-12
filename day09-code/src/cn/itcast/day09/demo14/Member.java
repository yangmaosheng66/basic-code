package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

// 普通成员
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包当中随便抽取一个，给我自己

        int index = new Random().nextInt(list.size());

        //
        super.setMoney(super.getMoney() + list.remove(index));
    }
}
