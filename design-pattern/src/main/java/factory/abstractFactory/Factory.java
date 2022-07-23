package factory.abstractFactory;

import factory.Drink;
import factory.Food;

/**
 * @ClassName: Factory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 4:38 下午
 */
// 抽象工厂
public interface Factory {
    Food getFood();
    Drink getDrink();
}
