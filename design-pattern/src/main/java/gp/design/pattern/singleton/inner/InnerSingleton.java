package gp.design.pattern.singleton.inner;

/**
 * 项目名称：GP-Demo
 * 类 名 称：InnerSingleton
 * 类 描 述：利用内部类的机制巧妙的实现单例
 * 创建时间：2019/12/3 12:18 AM
 * 创 建 人：wangjiang
 *
 * {@URL https://blog.csdn.net/mnb65482/article/details/80458571}
 */
public class InnerSingleton {

    private InnerSingleton() {
    }

    /**
     * 静态内部类的优点是：
     * 外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存。
     * 即当SingleTon第一次被加载时，并不需要去加载SingleTonHoler，
     * 只有当getInstance()方法第一次被调用时，才会去初始化INSTANCE,
     * 第一次调用getInstance()方法会导致虚拟机加载SingleTonHoler类，
     * 这种方法不仅能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
     *
     * @return
     */
    public static InnerSingleton getInstance() {
        return SingletonHolder.innerSingleton;
    }

    /**
     * 非静态内部类，不能定义静态的属性、静态的方法
     * 静态内部类，既可以定义静态的属性、静态的方法；也可以定义非静态的属性和方法
     */
    private static class SingletonHolder {
        private static final InnerSingleton innerSingleton = new InnerSingleton();
    }

}
