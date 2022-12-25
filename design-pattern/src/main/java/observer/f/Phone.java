package observer.f;

/**
 * @ClassName: Phone
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 9:39 下午
 */
// 手机
public class Phone implements Observer {

    private WeatherStation ws;

    public Phone(WeatherStation ws) {
        this.ws = ws;
        // 非常巧妙，因为引用了WeatherStation对象，直接将BroadCast注册到观察者集合
        ws.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("手机显示温度：" + ws.getTemperature());
        System.out.println("手机显示湿度：" + ws.getHumidity());
        System.out.println("手机显示气压：" + ws.getPressure());
    }
}
