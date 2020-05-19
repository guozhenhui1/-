package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    /**
     * 数据更新时，ob调用
     */
    public void update() {
        System.out.println("update method execute");
        display();
    }

    public void display() {
        System.out.println("display method execute");
    }
}
