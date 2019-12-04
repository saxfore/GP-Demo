package gp.design.pattern.factory.abstracts;

import gp.design.pattern.factory.entity.Transport;
import gp.design.pattern.factory.entity.TvMachine;
import gp.design.pattern.factory.method.CarFactory;
import gp.design.pattern.factory.method.MethodTransportFactory;

/**
 * 项目名称：GP-Demo
 * 类 名 称：LenovoFactory
 * 类 描 述：联想生产厂
 * 创建时间：2019/12/4 10:52 PM
 * 创 建 人：wangjiang
 */
public class LenovoFactory implements AbstractFatory {

    /**
     * 生产交通工具-联想生产小轿车
     *
     * @return
     */
    @Override
    public Transport createTransport() {
        MethodTransportFactory factory = new CarFactory();
        return factory.create();
    }

    /**
     * 生产电视-联想生产彩色电视
     *
     * @return
     */
    @Override
    public TvMachine createTvMachine() {
        // ...
        return null;
    }
}
