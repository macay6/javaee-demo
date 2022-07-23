package factory;

/**
 * @ClassName: Rice
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 2:43 下午
 */
public class Rice implements Food{
    @Override
    public void eat() {
        System.out.println("吃米饭");
    }
}
