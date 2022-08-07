package strategy.d;

/**
 * @ClassName: FlyWithKick
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 2:44 下午
 */
public class FlyWithKick implements FlyBehiavor{
    @Override
    public void fly() {
        System.out.println("被踹飞");
    }
}
