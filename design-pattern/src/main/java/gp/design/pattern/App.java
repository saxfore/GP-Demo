package gp.design.pattern;

import gp.design.pattern.singleton.enums.DataSourceEnum;
import gp.design.pattern.singleton.enums.DBConnection;

/**
 * 项目名称：GP-Demo
 * 类 名 称：App
 * 类 描 述：TODO
 * 创建时间：2019/12/2 11:49 PM
 * 创 建 人：wangjiang
 */
public class App {

    public static void main(String[] args) {

        // 枚举单例
        DBConnection connection1 = DataSourceEnum.DATASOURCE.getConnection();
        DBConnection connection2 = DataSourceEnum.DATASOURCE.getConnection();

        System.out.println("connection1 = [" + connection1 + "]");
        System.out.println("connection2 = [" + connection2 + "]");

    }

}
