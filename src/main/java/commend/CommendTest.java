package commend;

public class CommendTest {

    public static void main(String[] args) {
        // 待执行的命令
        Commend wakeup = new Commend() {
            public void execute() {
                System.out.println("====>>> execute end.");
            }
        };
        ActiveObjectEngine engine = new ActiveObjectEngine();
        SleepCommend c = new SleepCommend(wakeup, 10000L, engine);
        engine.add(c);
        long start = System.currentTimeMillis();
        engine.run();
        long end = System.currentTimeMillis();
        System.out.println("====>>>> finshed" + (end - start));
    }

}
