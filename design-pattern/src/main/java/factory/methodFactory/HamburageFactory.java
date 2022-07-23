package factory.methodFactory;

import factory.Food;
import factory.Hamburage;

/**
 * @ClassName: HamburageFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 2:32 下午
 */
public class HamburageFactory implements FoodFactory{
    @Override
    public Food getFood() {
        return new Hamburage();
    }
}
