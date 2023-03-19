package com.zzuli.wth.principle.dip;

/**
 * @Author: wth
 * @Create: 2023/3/18 - 16:01
 */
public class DependencyInversion2 {

    public static void main(String[] args) {
        IUser phone = new Phone();
        phone.receive(new Email2());
        phone.receive(new WeiXin());
        IUser computer = new Computer();
        computer.receive(new Email2());
        computer.receive(new WeiXin());
    }
}

// 改进版
// IUser依赖Email2和WeiXin的抽象IReceiver，提高了可复用性。
interface IReceiver {
    String getInfo();
}

class Email2 implements IReceiver {
    public String getInfo() {
        return "email信息 : hello, world";
    }
}

class WeiXin implements IReceiver {
    @Override
    public String getInfo() {
        return "weixin : hello, world";
    }
}

interface IUser {
    void receive(IReceiver receiver);
}

class Phone implements IUser {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

class Computer implements IUser {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}