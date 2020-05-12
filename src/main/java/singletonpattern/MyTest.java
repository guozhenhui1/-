package singletonpattern;

public class MyTest {

    public static void main(String[] args) {
        System.out.println(InnerStaticSingle.getInstance());
        System.out.println(InnerStaticSingle.getInstance());
        System.out.println(InnerStaticSingle.getInstance());
    }
}
