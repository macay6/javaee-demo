package strategy.c;

/**
 * @ClassName: FlyAble
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/7 11:05 上午
 */
public interface FlyAble {

    // 默认方法，子类如果重写就用子类的，子类不重写就用父类的
    default void fly() {
        System.out.println("我飞");
    }
}
