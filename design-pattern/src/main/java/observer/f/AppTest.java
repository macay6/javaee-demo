package observer.f;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 9:47 下午
 */
public class AppTest {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        Phone phone = new Phone(ws);
        BroadCast broadCast = new BroadCast(ws);
        ws.setData(12.0, 23.3, 34.0);
    }
}
