package strategy.d;

/**
 * @ClassName: FlyWithRocket
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 2:43 下午
 */
public class FlyWithRocket implements FlyBehiavor{
    @Override
    public void fly() {
        System.out.println("坐着火箭飞");
    }
}
