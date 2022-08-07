package strategy.d;

/**
 * @ClassName: Quack
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 2:46 下午
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}
