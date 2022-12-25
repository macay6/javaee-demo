package strategy.d;

/**
 * @ClassName: MallardDuck
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 10:21 上午
 */
// 绿头鸭
public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
    }

    public MallardDuck(FlyBehiavor fb, QuackBehavior qb) {
        super(fb, qb);
    }

    @Override
    public void display() {
        System.out.println("外观是绿头鸭");
    }
}
