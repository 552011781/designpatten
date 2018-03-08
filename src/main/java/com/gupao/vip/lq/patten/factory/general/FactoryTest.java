package com.gupao.vip.lq.patten.factory.general;

/**
 * 电脑工厂测试类
 *
 * @author LQ
 * @create 2018-03-08 15:24
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory hpfactory = new HuipuFactory();
        hpfactory.createComputer().info();

        Factory daierFactory = new DaierFactory();
        daierFactory.createComputer().info();

    }
}
