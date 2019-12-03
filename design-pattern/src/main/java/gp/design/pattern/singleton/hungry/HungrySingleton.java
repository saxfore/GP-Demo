package gp.design.pattern.singleton.hungry;

/**
 * 项目名称：GP-Demo
 * 类 名 称：HungrySingleton
 * 类 描 述：饿汉式单例
 * 创建时间：2019/12/2 11:51 PM
 * 创 建 人：wangjiang
 */
public class HungrySingleton {

    /**
     * 不管使不使用都会进行实例化
     */
    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * 私有化构造器，防止其他类进行new实例化
     */
    private HungrySingleton() {

        // 此处抛出异常 为了防止其他类使用反射机制暴力破坏单例
        if (instance != null) {
            throw new RuntimeException("不允许创建多个HungrySingleton实例！");
        }
    }

    /**
     * 产生单例
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return instance;
    }

}
