package command.b;

import java.util.Map;
import java.util.Set;

/**
 * @ClassName: OrderCommand
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/25 1:31 下午
 */
public class OrderCommand implements Command{

    // 持有接收者对象
    private Chef chef;

    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getIndex() + "号桌的订单：");
        Map<String, Integer> food = order.getFood();
        Set<String> strings = food.keySet();
        for (String string : strings) {
            chef.makeFood((Integer)food.get(string), string);
        }
        System.out.println(order.getIndex() + "桌的订单准备好了");
    }
}
