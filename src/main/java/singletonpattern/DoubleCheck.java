package singletonpattern;

/**
 * 线程安全，且效率还行；多线程情况下推荐三颗星
 */
public class DoubleCheck {
    private static volatile DoubleCheck instance;

    private DoubleCheck() {};

    public static DoubleCheck getInstance() {
        // 第一次check
        if (instance == null) {
            // 同步代码块，大概率只会进入依次同步方法，可以提升性能
            synchronized (DoubleCheck.class) {
                // 第二次check
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
