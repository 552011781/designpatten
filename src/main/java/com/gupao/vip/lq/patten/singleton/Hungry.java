package com.gupao.vip.lq.patten.singleton;

/**
 * 饿汉式
 * 线程安全
 * 不管你用不用，先实例化好，用的时候直接拿来用
 *
 * @author LQ
 * @create 2018-03-08 16:52
 */
public class Hungry {

    private static final Hungry hungry = new Hungry();

    //标识是否被初始化
    private static boolean isInitial = false;

    private Hungry() {
        //防止通过反射实例化
        synchronized (Hungry.class){
            if(isInitial){
                throw new RuntimeException("大哥，你已经来过了，别再来了");
            } else{
                isInitial = !isInitial;
            }
        }
    }

    public static Hungry getInstance(){
        return hungry;
    }

    @Override
    public String toString() {
        return "单例模式之饿汉式(线程安全)";
    }
}
