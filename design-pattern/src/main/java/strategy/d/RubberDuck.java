package strategy.d;

/**
 * @ClassName: RubberDuck
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 10:41 上午
 */
// 橡皮鸭
public class RubberDuck extends Duck{

    public RubberDuck(FlyBehiavor fb, QuackBehavior qb) {
        super(fb, qb);
    }

    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }
}
