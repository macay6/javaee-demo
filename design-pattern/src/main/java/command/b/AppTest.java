package command.b;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/25 1:41 下午
 */
public class AppTest {
    public static void main(String[] args) {
        // 创建2个order
        Order order = new Order();
        order.setIndex(1);
        order.setFood("重庆小面", 2);

        Order order1 = new Order();
        order1.setIndex(3);
        order1.setFood("黄焖鸡米饭", 1);
        order1.setFood("冰峰", 1);

        // 将订单和接收者封装成命令对象
        OrderCommand orderCommand = new OrderCommand(new Chef(), order);
        OrderCommand orderCommand1 = new OrderCommand(new Chef(), order1);

        // 创建调用者 waitor
        Waiter waiter = new Waiter();
        waiter.setCommond(orderCommand);
        waiter.setCommond(orderCommand1);
        // 将订单带到柜台 并向厨师喊 订单来了
        waiter.orderUp();
    }
}
