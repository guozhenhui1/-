package commend;

import java.util.LinkedList;

public class ActiveObjectEngine {
    private LinkedList<Commend> commends = new LinkedList();

    public void add(Commend c){
        commends.add(c);
    }

    public void run() {
        while (!commends.isEmpty()) {
            Commend c = commends.getFirst();;
            commends.removeFirst();
            c.execute();
        }
    }
}
