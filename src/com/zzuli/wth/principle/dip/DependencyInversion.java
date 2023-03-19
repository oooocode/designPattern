package com.zzuli.wth.principle.dip;

/**
 * @Author: wth
 * @Create: 2023/3/18 - 16:01
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
// 如果此时有weixin,qq等，Person类又要扩充新的方法
class Email {

    public String getInfo() {
        return "email信息 : hello, world";
    }
}

class Person {

    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}