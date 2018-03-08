package com.gupao.vip.lq.patten.factory.general;

import com.gupao.vip.lq.patten.factory.Computer;
import com.gupao.vip.lq.patten.factory.Daier;

/**
 * 戴尔生产工厂
 *
 * @author LQ
 * @create 2018-03-08 15:23
 */
public class DaierFactory implements Factory {
    public Computer createComputer() {
        return new Daier();
    }
}
