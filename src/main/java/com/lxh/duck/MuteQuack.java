package com.lxh.duck;

/**
 * @author lixianghuan@allcomchina.com
 * @date 2019/4/16 19:50
 * @extra code change the world
 * @description
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("no quack");
    }
}
