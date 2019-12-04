package gp.design.pattern.factory.entity;

/**
 * 项目名称：GP-Demo
 * 类 名 称：TvMachine
 * 类 描 述：电视机
 * 创建时间：2019/12/4 10:46 PM
 * 创 建 人：wangjiang
 */
public interface TvMachine {

    /**
     * 电视剧名称-黑白电视/彩色电视/液晶电视
     *
     * @return
     */
    String name();

    /**
     * 电视大小
     *
     * @return
     */
    String size();
}
