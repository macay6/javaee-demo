package observer.h;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: BroadCast
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/24 10:18 上午
 */
public class BroadCast implements Observer {
    private WeatherStation ws;

    public BroadCast(WeatherStation weatherStation) {
        this.ws = weatherStation;
        ws.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("广告牌显示温度：" + ws.getTemperature());
        System.out.println("广告牌显示湿度：" + ws.getHumidity());
        System.out.println("广告牌显示气压：" + ws.getPressure());
    }
}
