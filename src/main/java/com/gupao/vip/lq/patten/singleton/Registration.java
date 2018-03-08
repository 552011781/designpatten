package com.gupao.vip.lq.patten.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册登记式
 * 线程安全
 *
 * @author LQ
 * @create 2018-03-08 17:29
 */
public class Registration {
    private Registration(){}

    private static Map<String,Registration> instanceMap = new ConcurrentHashMap<String, Registration>();

    private static final String INSTANCE_KEY = "instanceKey";

    public static Registration getInstance(){
        Registration registration = instanceMap.get(INSTANCE_KEY);
        if(null == registration){
            registration = new Registration();
            instanceMap.put(INSTANCE_KEY, registration);
        }
        return registration;
    }
}
