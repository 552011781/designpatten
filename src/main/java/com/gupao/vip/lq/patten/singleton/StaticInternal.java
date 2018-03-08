package com.gupao.vip.lq.patten.singleton;

/**
 * 静态内部类
 * 线程安全
 *
 * @author LQ
 * @create 2018-03-08 17:20
 */
public class StaticInternal {
    private StaticInternal(){}

    public static final StaticInternal getInstance(){
        return StaticInternalHolder.staticInternal;
    }

    private static class StaticInternalHolder {
        private static final StaticInternal staticInternal = new StaticInternal();
    }

    @Override
    public String toString() {
        return "单例模式之静态内部类(线程安全)";
    }
}
