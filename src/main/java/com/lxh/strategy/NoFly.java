package com.lxh.strategy;

/**
 * @author lixianghuan@allcomchina.com
 * @date 2019/4/16 19:49
 * @extra code change the world
 * @description
 */
public class NoFly implements FlyBehavior {

    public void fly() {
        System.out.println("I cant fly");
    }
}
