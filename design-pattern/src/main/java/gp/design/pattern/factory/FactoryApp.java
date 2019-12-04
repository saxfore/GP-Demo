package gp.design.pattern.factory;

import gp.design.pattern.factory.abstracts.AbstractFatory;
import gp.design.pattern.factory.abstracts.LenovoFactory;
import gp.design.pattern.factory.entity.Car;
import gp.design.pattern.factory.entity.Transport;
import gp.design.pattern.factory.method.CarFactory;
import gp.design.pattern.factory.method.MethodTransportFactory;
import gp.design.pattern.factory.simple.SImpleTransportFactory;

/**
 * 项目名称：GP-Demo
 * 类 名 称：FactoryApp
 * 类 描 述：TODO
 * 创建时间：2019/12/4 10:25 PM
 * 创 建 人：wangjiang
 */
public class FactoryApp {

    public static void main(String[] args) {


    }

    /**
     * 违反开闭原则，再增加一种需要更改TransportFactory中的代码
     *
     * @return
     */
    public static Transport simpleFactory() {
        String type = "car";
        SImpleTransportFactory factory = new SImpleTransportFactory();
        Transport transport = factory.create(type);
        Car car = (Car) transport;
        return car;
    }

    /**
     * 符合开闭原则，增加一种新增实现类即可
     *
     * @return
     */
    public static Transport methodFactory() {
        MethodTransportFactory factory = new CarFactory();
        Transport transport = factory.create();
        Car car = (Car) transport;
        return car;
    }

    /**
     * 产品族工厂
     *
     * @return
     */
    public static Transport abstractFactory() {
        AbstractFatory abstractFatory = new LenovoFactory();
        Transport transport = abstractFatory.createTransport();
        Car car = (Car) transport;
        return car;
    }

}
