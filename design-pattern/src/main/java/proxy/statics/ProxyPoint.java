package proxy.statics;

/**
 * @ClassName: ProxyPoint
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 10:43 上午
 */
//代售点
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
      trainStation.sell();
    }
}
