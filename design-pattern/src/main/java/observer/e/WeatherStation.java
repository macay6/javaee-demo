package observer.e;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: WeatherStation
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 9:36 下午
 */
public class WeatherStation {

    private Double temperature;

    private Double humidity;

    private Double pressure;

    private List<Observer> observers = new ArrayList<>();

    public void setData(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 设值完毕后通知观察者
        this.notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Object obj) {
        observers.remove(obj);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }
}
