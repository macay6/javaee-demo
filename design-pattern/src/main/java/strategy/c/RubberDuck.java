package strategy.c;

/**
 * @ClassName: RubberDuck
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 10:41 上午
 */
// 橡皮鸭
public class RubberDuck extends Duck implements QuackAble {

    // 因为橡皮鸭不会像真实的鸭子一样叫，所有模拟了一下叫声
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }
}
