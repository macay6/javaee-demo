package strategy.a;

/**
 * @ClassName: Duck
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 10:18 上午
 */
// 有抽象方法，定义为抽象类
public abstract class Duck {

    public void quack() {
        System.out.println("嘎嘎叫");
    }

    public void swim() {
        System.out.println("游泳");
    }

    /**
     * 添加飞的方法
     */
    public void fly() {
        System.out.println("我飞");
    }

    /**
     * 鸭子的外观不一样，定义为抽象方法，由子类实现
     */
    public abstract void display();
}
