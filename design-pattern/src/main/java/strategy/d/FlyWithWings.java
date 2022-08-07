package strategy.d;

/**
 * @ClassName: FlyWithWings
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 2:42 下午
 */
public class FlyWithWings implements FlyBehiavor{
    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }
}
