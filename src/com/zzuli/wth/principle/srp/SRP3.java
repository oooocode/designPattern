package com.zzuli.wth.principle.srp;

/**
 * @Author: wth
 * @Create: 2023/3/18 - 10:54
 */
public class SRP3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("潜艇");
    }
}
// 类没有完全遵守单一原则，但是方法遵守了
class Vehicle2 {

    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在路上运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空运行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行");
    }


}
