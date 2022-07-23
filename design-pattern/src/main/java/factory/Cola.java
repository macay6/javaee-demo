package factory;

/**
 * @ClassName: Cola
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 4:22 下午
 */
public class Cola implements Drink{
    @Override
    public void drink() {
        System.out.println("喝可乐");
    }
}
