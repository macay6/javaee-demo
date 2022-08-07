package strategy.d;

/**
 * @ClassName: Squeak
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 2:47 下午
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
