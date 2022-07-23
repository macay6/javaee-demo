package factory.abstractFactory;

import factory.Cola;
import factory.Drink;
import factory.Food;
import factory.Hamburage;

/**
 * @ClassName: KFCFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 4:41 下午
 */
public class KFCFactory implements Factory{

    @Override
    public Food getFood() {
        return new Hamburage();
    }

    @Override
    public Drink getDrink() {
        return new Cola();
    }
}
