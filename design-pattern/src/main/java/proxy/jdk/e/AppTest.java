package proxy.jdk.e;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 2:37 下午
 */
public class AppTest {
    public static void main(String[] args) {
        Drink proxy = (Drink) MyProxy.getProxy(new IcePeak());
        proxy.drink();
        System.out.println(proxy.getClass());
    }
}
