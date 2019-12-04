package gp.design.pattern.factory.abstracts;

import gp.design.pattern.factory.entity.Car;
import gp.design.pattern.factory.entity.Transport;
import gp.design.pattern.factory.entity.TvMachine;

/**
 * 项目名称：GP-Demo
 * 类 名 称：AbstractFatory
 * 类 描 述：产品族工厂
 * 创建时间：2019/12/4 10:42 PM
 * 创 建 人：wangjiang
 */
public interface AbstractFatory {

    /**
     * 生产交通工具
     *
     * @return
     */
    Transport createTransport();

    /**
     * 生产电视
     *
     * @return
     */
    TvMachine createTvMachine();

}
