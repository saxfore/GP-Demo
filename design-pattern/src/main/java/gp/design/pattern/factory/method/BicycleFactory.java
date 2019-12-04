package gp.design.pattern.factory.method;

import gp.design.pattern.factory.entity.Bicycle;
import gp.design.pattern.factory.entity.Transport;

/**
 * 项目名称：GP-Demo
 * 类 名 称：BicycleFactory
 * 类 描 述：TODO
 * 创建时间：2019/12/4 10:31 PM
 * 创 建 人：wangjiang
 */
public class BicycleFactory implements MethodTransportFactory {

    /**
     * 创建交通工具的接口
     *
     * @return
     */
    @Override
    public Transport create() {
        return new Bicycle();
    }
}
