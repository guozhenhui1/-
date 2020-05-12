package commend;

public class SleepCommend implements Commend {
    private Long sleepTime;
    private ActiveObjectEngine e;
    private Commend c;
    private volatile boolean started = false;
    private Long startTime;
    private Long endTime;

    public SleepCommend(Commend c, Long waitTime, ActiveObjectEngine e){
        this.c = c;
        this.sleepTime = waitTime;
        this.e = e;
    };
    // 控制开始

    public void execute() {
        Long currentTime = System.currentTimeMillis();
        if (!started) {
            started = true;
            startTime = System.currentTimeMillis();
            System.out.println("====>>> started");
            e.add(this);
        } else if ((currentTime - startTime) < sleepTime) {
            e.add(this);
            System.out.println("====>>> wait");
        } else {
            e.add(c);
            System.out.println("====>>> execute");
        }
    }
}
