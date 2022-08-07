package strategy.b;

/**
 * @ClassName: Duck
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 10:18 上午
 */
// 有抽象方法，定义为抽象类
public abstract class Duck {

    public void swim() {
        System.out.println("游泳");
    }

    /**
     * 鸭子的外观不一样，定义为抽象方法，由子类实现
     */
    public abstract void display();
}
