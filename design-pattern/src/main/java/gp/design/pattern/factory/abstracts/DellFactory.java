package gp.design.pattern.factory.abstracts;

import gp.design.pattern.factory.entity.Transport;
import gp.design.pattern.factory.entity.TvMachine;
import gp.design.pattern.factory.method.BicycleFactory;
import gp.design.pattern.factory.method.MethodTransportFactory;

/**
 * 项目名称：GP-Demo
 * 类 名 称：DellFactory
 * 类 描 述：TODO
 * 创建时间：2019/12/4 10:54 PM
 * 创 建 人：wangjiang
 */
public class DellFactory implements AbstractFatory {

    /**
     * 生产交通工具-戴尔生产自行车
     *
     * @return
     */
    @Override
    public Transport createTransport() {
        MethodTransportFactory factory = new BicycleFactory();
        return factory.create();
    }

    /**
     * 生产电视-戴尔生产黑白电视
     *
     * @return
     */
    @Override
    public TvMachine createTvMachine() {
        // TvHeibai();
        return null;
    }
}
