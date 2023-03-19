package com.zzuli.wth.principle.isp.improve;

/**
 * @Author: wth
 * @Create: 2023/3/18 - 12:01
 */
public class Segragation1 {

    public static void main(String[] args) {
        A a = new A();

    }
}
// 违反了接口隔离原则， A 使用的 B 实现了 A 不需要的方法，不是最小接口
interface Interface1 {
    void operation1();
}
interface Interface2 {
    void operation2();
    void operation3();
}
interface Interface3 {
    void operation4();
    void operation5();
}
class A {

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}
class B implements Interface1,Interface2{


    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation4");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation5");
    }
}
class C {

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}
class D implements Interface1,Interface3{


    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }


    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}