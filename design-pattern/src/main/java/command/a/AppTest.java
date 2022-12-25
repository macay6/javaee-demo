package command.a;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/25 10:23 上午
 */
public class AppTest {
    public static void main(String[] args) {
        Waiter waiter = new Waiter(new Chef());
        waiter.orderUp();
    }
}
