package com.lxh.duck;

/**
 * @author lixianghuan@allcomchina.com
 * @date 2019/4/16 19:53
 * @extra code change the world
 * @description
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("this is a mallard duck");
    }
}
