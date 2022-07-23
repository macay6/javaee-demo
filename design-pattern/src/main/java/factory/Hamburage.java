package factory;

/**
 * @ClassName: Hamburage
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 11:25 上午
 */
public class Hamburage implements Food {
    @Override
    public void eat() {
        System.out.println("吃汉堡包");
    }
}
