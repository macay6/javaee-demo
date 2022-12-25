package proxy.statics;

/**
 * @ClassName: TrainStation
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 10:42 上午
 */
//火车站  火车站具有卖票功能，所以需要实现SellTickets接口
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
