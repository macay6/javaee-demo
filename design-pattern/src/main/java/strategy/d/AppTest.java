package strategy.d;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 10:25 上午
 */
public class AppTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.swim();
        // 运行时改变了方法行为
        mallardDuck.setFb(new FlyWithWings());
        mallardDuck.performFly();
        // 运行时改变了方法行为
        mallardDuck.setQb(new Quack());
        mallardDuck.performQuack();
        mallardDuck.display();
    }
}
