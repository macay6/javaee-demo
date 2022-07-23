package factory.methodFactory;

import factory.Food;

/**
 * @ClassName: FoodBussiness
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 3:18 下午
 */
public class FoodBussiness {
    public static void taste(FoodFactory foodFactory) {
        Food food = foodFactory.getFood();
        System.out.println("评委1，品尝");
        food.eat();

        Food food2 = foodFactory.getFood();
        System.out.println("评委2，品尝");
        food.eat();

        Food food3 = foodFactory.getFood();
        System.out.println("评委3，品尝");
        food.eat();
    }
}
