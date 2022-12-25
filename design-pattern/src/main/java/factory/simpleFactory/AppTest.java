package factory.simpleFactory;

import factory.Food;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 11:14 上午
 */
public class AppTest {
    public static void main(String[] args) {
        Food food = SimpleFoodFactory1.getFood("hamburage");
        food.eat();
    }
}
