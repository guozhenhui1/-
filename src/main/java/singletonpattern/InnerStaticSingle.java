package singletonpattern;

public class InnerStaticSingle {
    private InnerStaticSingle() {};
    static {
        System.out.println("外部静态代码块");
    }
    private static class SingleHandler {
        static {
            System.out.println("内部静态代码块");
        }
         private static InnerStaticSingle instance = new InnerStaticSingle();
    };

    public static InnerStaticSingle getInstance() {
        return SingleHandler.instance;
    }
}
