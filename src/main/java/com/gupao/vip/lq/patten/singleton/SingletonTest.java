package com.gupao.vip.lq.patten.singleton;

/**
 * 单例模式测试
 *
 * @author LQ
 * @create 2018-03-08 17:04
 */
public class SingletonTest {
    public static void main(String[] args) {
        //饿汉式
        Hungry hungry = Hungry.getInstance();
        System.out.println(hungry);

        //懒汉式
        Lazy lazy = Lazy.getInstance();
        System.out.println(lazy);

        //静态内部类
        StaticInternal staticInternal = StaticInternal.getInstance();
        System.out.println(staticInternal);


    }
}
