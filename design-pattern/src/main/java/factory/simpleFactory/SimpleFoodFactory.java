package factory.simpleFactory;

import factory.Food;
import factory.Hamburage;
import factory.RiceNoodle;

/**
 * @ClassName: SimpleFoodFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 11:44 上午
 */
public class SimpleFoodFactory {
    public static Food getFood(String foodName) {
        Food food = null;
        switch (foodName) {
            case "hamburage" :
                food = new Hamburage();
                break;
            case "riceNoodle":
                food = new RiceNoodle();
                break;
            default:
        }
        return food;
    }
}
