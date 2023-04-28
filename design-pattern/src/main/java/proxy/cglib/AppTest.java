package proxy.cglib;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/24 12:04 下午
 */
public class AppTest {

    public static void main(String[] args) {
        IcePeak proxy = (IcePeak)CglibProxy.getProxy(IcePeak.class);
        proxy.drink();

    }
}
