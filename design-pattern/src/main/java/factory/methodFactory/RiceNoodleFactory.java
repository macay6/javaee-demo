package factory.methodFactory;

import factory.Food;
import factory.RiceNoodle;

/**
 * @ClassName: HamburageFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 2:32 下午
 */
public class RiceNoodleFactory implements FoodFactory{
    @Override
    public Food getFood() {
        return new RiceNoodle();
    }
}
