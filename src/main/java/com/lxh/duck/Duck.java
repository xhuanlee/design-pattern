package com.lxh.duck;

/**
 * @author lixianghuan@allcomchina.com
 * @date 2019/4/16 19:47
 * @extra code change the world
 * @description
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float...");
    }

}
