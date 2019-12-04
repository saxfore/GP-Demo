package gp.design.pattern.factory.entity;

/**
 * 项目名称：GP-Demo
 * 类 名 称：Bicycle
 * 类 描 述：TODO
 * 创建时间：2019/12/4 10:21 PM
 * 创 建 人：wangjiang
 */
public class Bicycle implements Transport {

    @Override
    public String name() {
        System.out.println("小黄车...");
        return null;
    }

    @Override
    public String color() {
        System.out.println("黄色...");
        return null;
    }
}
