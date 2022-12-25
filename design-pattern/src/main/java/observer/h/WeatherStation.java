package observer.h;

import java.util.Observable;

/**
 * @ClassName: WeatherStation
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/24 10:10 上午
 */
public class WeatherStation extends Observable {

    private Double temperature;

    private Double humidity;

    private Double pressure;

    public void setData(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 修改状态
        setChanged();
        // 通知消费者
        this.notifyObservers();

    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }
}
