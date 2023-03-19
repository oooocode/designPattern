package com.zzuli.wth.principle.srp;

/**
 * @Author: wth
 * @Create: 2023/3/18 - 10:51
 */
public class SRP1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("公交车");
        vehicle.run("飞机");
    }
}
// 破坏了单一职责原则
class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在路上运行");
    }
}
