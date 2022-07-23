package factory.methodFactory;

import factory.Cola;
import factory.Drink;

/**
 * @ClassName: ColaFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 4:23 下午
 */
public class ColaFactory implements DrinkFactory {
    @Override
    public Drink getDrink() {
        return new Cola();
    }
}
