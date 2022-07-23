package factory.methodFactory;

import factory.Drink;
import factory.IcePeak;

/**
 * @ClassName: IcePeakFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 4:24 下午
 */
public class IcePeakFactory implements DrinkFactory {
    @Override
    public Drink getDrink() {
        return new IcePeak();
    }
}
