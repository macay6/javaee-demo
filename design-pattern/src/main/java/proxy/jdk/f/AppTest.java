package proxy.jdk.f;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 2:37 下午
 */
public class AppTest {
    public static void main(String[] args) {

        ICalc proxy = (ICalc) MyProxy.getProxy(new ICalcImpl(), new MyInterceptorB());
        proxy.add(1,2);
        proxy.mul(1,2);
        proxy.sub(1,2);
        proxy.div(1,2);
    }
}
