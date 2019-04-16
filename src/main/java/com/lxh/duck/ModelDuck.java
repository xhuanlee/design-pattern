package com.lxh.duck;

/**
 * @author lixianghuan@allcomchina.com
 * @date 2019/4/16 19:55
 * @extra code change the world
 * @description
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("model duck");
    }

}
