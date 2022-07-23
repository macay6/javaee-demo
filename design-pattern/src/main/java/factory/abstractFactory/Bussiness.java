package factory.abstractFactory;

import factory.Drink;
import factory.Food;

/**
 * @ClassName: Bussiness
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 4:45 下午
 */
public class Bussiness {
    public static void taste(Factory factory) {
        Food food = factory.getFood();
        Drink drink = factory.getDrink();
        System.out.println("评委1，品尝");
        food.eat();
        drink.drink();

        Food food2 = factory.getFood();
        Drink drink2 = factory.getDrink();
        System.out.println("评委2，品尝");
        food2.eat();
        drink2.drink();

        Food food3 = factory.getFood();
        Drink drink3 = factory.getDrink();
        System.out.println("评委3，品尝");
        food3.eat();
        drink3.drink();
    }
}
