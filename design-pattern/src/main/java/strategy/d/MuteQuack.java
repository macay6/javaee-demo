package strategy.d;

/**
 * @ClassName: MuteQuack
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 2:48 下午
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("silence......");
    }
}
