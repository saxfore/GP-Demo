package gp.design.pattern.factory.simple;

import gp.design.pattern.factory.entity.Bicycle;
import gp.design.pattern.factory.entity.Car;
import gp.design.pattern.factory.entity.Transport;

/**
 * 项目名称：GP-Demo
 * 类 名 称：Transport
 * 类 描 述：交通工具
 * 创建时间：2019/12/4 10:15 PM
 * 创 建 人：wangjiang
 */
public class SImpleTransportFactory {

    /**
     * 创造交通工具
     *
     * @param type
     * @return
     */
    public Transport create(String type) {
        Transport transport = null;

        if ("car".equals(type)) {
            // 生产小轿车
            // 小轿车初始化操作
            transport = new Car();

        } else if ("bicycle".equals(type)) {
            // 生产自行车
            transport = new Bicycle();

        } else {
            // 不支持的类型
        }

        return transport;
    }

}
