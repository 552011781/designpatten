package com.gupao.vip.lq.patten.factory.simple;

/**
 * 工厂测试类
 *
 * @author LQ
 * @create 2018-03-08 15:13
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //普通工厂
        SimpleFactory sf = new SimpleFactory();
        sf.createComputer("惠普").info();
        sf.createComputer("戴尔").info();
    }
}
