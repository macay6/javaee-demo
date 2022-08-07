package strategy.b;

/**
 * @ClassName: MallardDuck
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 10:21 上午
 */
// 绿头鸭
public class MallardDuck extends Duck implements QuackAble, FlyAble {
    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }

    @Override
    public void fly() {
        System.out.println("飞起来了");
    }

    @Override
    public void display() {
        System.out.println("外观是绿头鸭");
    }
}
