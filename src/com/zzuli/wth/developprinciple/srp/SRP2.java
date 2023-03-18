package com.zzuli.wth.developprinciple.srp;

/**
 * @Author: wth
 * @Create: 2023/3/18 - 10:54
 */
public class SRP2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        roadVehicle.run("汽车");
        airVehicle.run("飞机");
        waterVehicle.run("潜艇");
    }
}
// 将类的职责划分
class RoadVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在路上运行");
    }
}

class AirVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在天空运行");
    }
}

class WaterVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在水中运行");
    }
}