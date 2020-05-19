package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气信息，被观察者。
 */
public class WeatherData {

    /**
     * 标识数据变动
     */
    private boolean change;

    /**
     * 持有的观察者
     */
    private List<Observer> obServers;

    // 注册观察者
    public void registerObServer(Observer ob) {
        if (obServers == null) {
            obServers = new ArrayList<Observer>();
        }
        obServers.add(ob);
        System.out.println("ob register success");
    };
    // 移除观察者
    public void removeObServer(Observer ob) {
        if (obServers == null) {
            return;
        }
        obServers.remove(ob);
        System.out.println("ob remove success");
    }

    // 数据表更，设置为true
    public void setChange() {
        change = true;
    }

    // 通知所有观察者
    public void notifyObservers() {
        if (change) {
            for (Observer ob: obServers) {
                ob.update();
            }
        }
    }
}
