package com.gupao.vip.lq.factory.abstr;

import com.gupao.vip.lq.factory.Computer;
import com.gupao.vip.lq.factory.Huipu;
import com.gupao.vip.lq.factory.general.HuipuFactory;

/**
 * 抽象工厂
 *
 * @author LQ
 * @create 2018-03-08 15:28
 */
public abstract class AbstractFactory {
    /**
    * @Description: 生产惠普电脑
    * @creat_user: LQ
    * @creat_date: 2018/3/8 15:39
    * @return:
    */
    public abstract Computer createHuipu();

    /**
    * @Description: 生产戴尔电脑
    * @creat_user: LQ
    * @creat_date: 2018/3/8 15:40
    * @return:
    */
    public abstract Computer createDaier();

    //TODO 这里可以添加其他品牌的电脑生产方法,易于扩展,符合开闭原则，用户不需要动，只需系统升级
    // public abstract Computer createHuashuo();
}

