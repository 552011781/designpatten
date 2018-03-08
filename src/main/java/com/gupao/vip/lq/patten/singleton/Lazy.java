package com.gupao.vip.lq.patten.singleton;

/**
 * 懒汉式
 * 线程安全，效率低
 * 用的时候才初始化
 *
 * @author LQ
 * @create 2018-03-08 17:07
 */
public class Lazy {
    private Lazy(){}

    private static Lazy lazy;

    public static synchronized Lazy getInstance(){
        if(null == lazy){
            lazy = new Lazy();
        }
        return lazy;
    }

    @Override
    public String toString() {
        return "单例模式之懒汉式（线程安全，效率低）";
    }
}
