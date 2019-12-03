package gp.design.pattern.singleton.enums;

/**
 * 项目名称：GP-Demo
 * 类 名 称：EnumSingleton
 * 类 描 述：枚举式单例--官方推荐
 * 创建时间：2019/12/3 12:32 AM
 * 创 建 人：wangjiang
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return new Object();
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
