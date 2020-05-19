import observer.CurrentConditionsDisplay;
import observer.Observer;
import observer.WeatherData;

public class WeatherDataTest {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer ob = new CurrentConditionsDisplay();
        wd.registerObServer(ob);
        // weather data数据变化了
        wd.setChange();
        wd.notifyObservers();
    }
}
