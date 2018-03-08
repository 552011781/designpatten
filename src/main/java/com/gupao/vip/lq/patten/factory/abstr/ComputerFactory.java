package com.gupao.vip.lq.patten.factory.abstr;

import com.gupao.vip.lq.patten.factory.Computer;
import com.gupao.vip.lq.patten.factory.general.DaierFactory;
import com.gupao.vip.lq.patten.factory.general.HuipuFactory;

/**
 * 电脑工厂
 *
 * @author LQ
 * @create 2018-03-08 15:31
 */
public class ComputerFactory extends AbstractFactory {
   public Computer createHuipu() {
        return new HuipuFactory().createComputer();
    }

    public Computer createDaier() {
        return new DaierFactory().createComputer();
    }
}
