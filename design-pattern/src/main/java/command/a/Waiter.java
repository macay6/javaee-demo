package command.a;

/**
 * @ClassName: Waiter
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/25 10:18 上午
 */
public class Waiter {

    private Chef chef;

    public Waiter(Chef chef) {
        this.chef = chef;
    }

    public void orderUp() {
        System.out.println("服务员：订单来了");
        chef.makeFood();
    }
}
