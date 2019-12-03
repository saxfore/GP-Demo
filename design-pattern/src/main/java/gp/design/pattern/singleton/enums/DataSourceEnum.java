package gp.design.pattern.singleton.enums;

/**
 * 项目名称：GP-Demo
 * 类 名 称：DataSourceEnum
 * 类 描 述：枚举式单例--官方推荐
 * 创建时间：2019/12/3 12:32 AM
 * 创 建 人：wangjiang
 */
public enum DataSourceEnum {

    DATASOURCE;

    private DBConnection connection = null;

    /**
     * 私有化构造器
     */
    private DataSourceEnum() {
        connection = new DBConnection();
    }

    /**
     * 枚举式单例是通过静态块来初始化枚举常量对象，静态块只会在类被加载的时候执行一次；
     * 即保证了枚举常量对象的唯一性
     * 那么枚举常量对象里的属性DBConnection自然也就是唯一的
     *
     * @return
     */
    public DBConnection getConnection() {
        return connection;
    }
}