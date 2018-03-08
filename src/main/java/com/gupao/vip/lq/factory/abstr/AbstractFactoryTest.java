package com.gupao.vip.lq.factory.abstr;

import com.gupao.vip.lq.factory.Computer;

/**
 * TODO
 *
 * @author LQ
 * @create 2018-03-08 15:32
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ComputerFactory cf = new ComputerFactory();
        cf.createDaier().info();
        cf.createHuipu().info();
    }
}
