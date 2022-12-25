package principle.InterfaceSegregationPrinciple;

/**
 * @ClassName: Bird
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 1:55 下午
 */
public class Bird implements animal{
    @Override
    public void eat() {
        System.out.println("鸟吃");
    }

    @Override
    public void drink() {
        System.out.println("鸟喝");
    }

    @Override
    public void fly() {
        System.out.println("鸟飞");
    }
}
