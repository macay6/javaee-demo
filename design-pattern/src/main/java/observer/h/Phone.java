package observer.h;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: Phone
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/24 10:14 上午
 */
public class Phone implements Observer {
    private WeatherStation ws;

    public Phone(WeatherStation weatherStation) {
        this.ws = weatherStation;
        ws.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("手机显示温度：" + ws.getTemperature());
        System.out.println("手机显示湿度：" + ws.getHumidity());
        System.out.println("手机显示气压：" + ws.getPressure());
    }
}
