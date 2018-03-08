package com.gupao.vip.lq.factory.abstr;

import com.gupao.vip.lq.factory.Computer;
import com.gupao.vip.lq.factory.Huipu;
import com.gupao.vip.lq.factory.general.DaierFactory;
import com.gupao.vip.lq.factory.general.HuipuFactory;

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
