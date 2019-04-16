package com.lxh.duck;

import org.junit.Test;

/**
 * @author lixianghuan@allcomchina.com
 * @date 2019/4/16 19:56
 * @extra code change the world
 * @description
 */
public class DuckTest {

    @Test
    public void mallardDuckTest() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }

    @Test
    public void modelDuckTest() {
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }

}
