package factory.methodFactory;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 11:14 上午
 */
public class AppTest {
//    public static void main(String[] args) {
//        FoodFactory foodFactory = new RiceFactory();
//        Food food = foodFactory.getFood();
//        food.eat();
//    }

    public static void main(String[] args) {
        FoodBussiness.taste(new HamburageFactory());
    }
}
