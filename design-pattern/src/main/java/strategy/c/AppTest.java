package strategy.c;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 10:25 上午
 */
public class AppTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();
        mallardDuck.display();
    }
}
