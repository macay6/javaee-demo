package strategy.d;

/**
 * @ClassName: RedHeadDuck
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 10:23 上午
 */
// 红头鸭
public class RedHeadDuck extends Duck {
    public RedHeadDuck(FlyBehiavor fb, QuackBehavior qb) {
        super(fb, qb);
    }

    @Override
    public void display() {
        System.out.println("外观是红头鸭");
    }
}
