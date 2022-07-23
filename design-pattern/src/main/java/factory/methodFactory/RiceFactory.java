package factory.methodFactory;

import factory.Food;
import factory.Rice;

/**
 * @ClassName: RiceFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 2:44 下午
 */
public class RiceFactory implements FoodFactory{
    @Override
    public Food getFood() {
        return new Rice();
    }
}
