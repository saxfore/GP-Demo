package gp.design.pattern.singleton.lazy;

/**
 * 项目名称：GP-Demo
 * 类 名 称：LazySingleton
 * 类 描 述：懒汉式单例
 * 创建时间：2019/12/2 11:52 PM
 * 创 建 人：wangjiang
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    /**
     * 私有化构造器，防止其他类进行new实例化
     */
    private LazySingleton() {

        // 此处抛出异常 为了防止其他类使用反射机制暴力破坏单例
        if (instance != null) {
            throw new RuntimeException("不允许创建多个LazySingleton1实例！");
        }
    }

    /**
     * 产生单例-但性能不高
     * 将synchronized关键字加到静态方法上，所有访问该静态方法的调用者都同步等待
     * 淘宝30万/s的并发，每个进入一次需要1ms，则至少需要300000*1/1000=300s
     *
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

}
