package observer.h;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/24 10:19 上午
 */
public class AppTest {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        Phone phone = new Phone(ws);
        BroadCast broadCast = new BroadCast(ws);
        ws.setData(11.1,22.3,44.5);
    }
}
