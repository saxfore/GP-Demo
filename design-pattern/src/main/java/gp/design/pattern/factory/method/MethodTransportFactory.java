package gp.design.pattern.factory.method;

import gp.design.pattern.factory.entity.Transport;

/**
 * 项目名称：GP-Demo
 * 类 名 称：Transport
 * 类 描 述：交通工具
 * 创建时间：2019/12/4 10:15 PM
 * 创 建 人：wangjiang
 */
public interface MethodTransportFactory {

    /**
     * 创建交通工具的接口
     *
     * @return
     */
    Transport create();

}
