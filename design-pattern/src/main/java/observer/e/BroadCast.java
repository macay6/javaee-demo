package observer.e;

/**
 * @ClassName: BroadCast
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 9:40 下午
 */
// 广告牌
public class BroadCast implements Observer{
    private WeatherStation ws;

    public BroadCast(WeatherStation ws) {
        this.ws = ws;
        // 非常巧妙，因为引用了WeatherStation对象，直接将BroadCast注册到观察者集合
        ws.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("广告牌显示温度：" + ws.getTemperature());
        System.out.println("广告牌显示湿度：" + ws.getHumidity());
        System.out.println("广告牌显示气压：" + ws.getPressure());
    }
}
