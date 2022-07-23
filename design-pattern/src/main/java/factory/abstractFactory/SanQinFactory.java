package factory.abstractFactory;

import factory.Drink;
import factory.Food;
import factory.IcePeak;
import factory.RiceNoodle;

/**
 * @ClassName: SanQinFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 4:43 下午
 */
public class SanQinFactory implements Factory{
    @Override
    public Food getFood() {
        return new RiceNoodle();
    }

    @Override
    public Drink getDrink() {
        return new IcePeak();
    }
}
