package com.gupao.vip.lq.patten.factory.general;

import com.gupao.vip.lq.patten.factory.Computer;
import com.gupao.vip.lq.patten.factory.Huipu;

/**
 * 惠普电脑生产工厂
 *
 * @author LQ
 * @create 2018-03-08 15:22
 */
public class HuipuFactory implements Factory {
    public Computer createComputer() {
        return new Huipu();
    }
}
