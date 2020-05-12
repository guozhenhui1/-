package singletonpattern;

/**
 * 在单线程的情况下工作良好，懒汉模式；非线程安全的
 * 单线程情况下，推荐
 */
public class Singleton1 {
    // 私有构造方法，可以避免被new出来
    private Singleton1() {};

    private static Singleton1 instance;
    // 提供一个静态访问的方法，全局其他地方可以直接访问
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

}
