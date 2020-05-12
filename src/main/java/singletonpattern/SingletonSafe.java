package singletonpattern;

/**
 * 饿汉模式，提前实例化对象，可以保证线程安全；缺点，浪费资源；
 * 不考虑资源情况下，推荐使用
 */
public class SingletonSafe {
    private SingletonSafe() {};
    // JVM在类加载的时候已经实例化
    private static SingletonSafe instance = new SingletonSafe();

    public static SingletonSafe getInstance() {
        return instance;
    }
}
