package gp.design.pattern.singleton.lazy;

/**
 * 项目名称：GP-Demo
 * 类 名 称：LazyDoubleCheckSingleton
 * 类 描 述：懒汉式
 * 创建时间：2019/12/3 12:07 AM
 * 创 建 人：wangjiang
 */
public class LazyDoubleCheckSingleton {

    // 加上volatile关键字防止指令重排序可避免DCL失效问题
    private volatile static LazyDoubleCheckSingleton instance = null;

    /**
     * 私有化构造器，防止其他类进行new实例化
     */
    private LazyDoubleCheckSingleton() {

        // 此处抛出异常 为了防止其他类使用反射机制暴力破坏单例
        if (instance != null) {
            throw new RuntimeException("不允许创建多个LazyDoubleCheckSingleton实例！");
        }
    }

    /**
     * 产生单例-双检查-会产生DCL问题
     * <p>
     *  1.在堆内存开辟内存空间。
     *  2.在堆内存中实例化Singleton里面的各个参数。（初始化）
     *  3.把对象指向堆内存空间。（引用和实例建立关联）
     * <p>
     * 由于jvm存在指令重排序的问题，
     * 所以可能在2还没执行时就先执行了3，
     * 如果此时再被切换到线程B上，由于执行了3，INSTANCE 已经非空了，
     * 会被直接拿出来用，这样的话，就会出现异常。
     * 这个就是著名的DCL失效问题。
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {

        // 当大量并发，这一步非常关键，能让后1/3的调用者不用竞争同步锁，直接返回instance
        // 如果是淘宝30w/s并发，则能节省300000/3*1/1000=100s
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }

        return instance;
    }

}
