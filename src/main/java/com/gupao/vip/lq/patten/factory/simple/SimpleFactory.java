package com.gupao.vip.lq.patten.factory.simple;

import com.gupao.vip.lq.patten.factory.Computer;
import com.gupao.vip.lq.patten.factory.Daier;
import com.gupao.vip.lq.patten.factory.Huipu;

/**
 * 简单工厂
 *
 * @author LQ
 * @create 2018-03-08 15:10
 */
public class SimpleFactory {
    public Computer createComputer(String type){
        if("惠普".equals(type)){
            return new Huipu();
        } else if("戴尔".equals(type)){
            return new Daier();
        }
        return null;
    }
}
