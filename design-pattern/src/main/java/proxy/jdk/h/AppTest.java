package proxy.jdk.h;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 2:37 下午
 */
public class AppTest {
    public static void main(String[] args) {

        // iCalc是目标对象
        ICalc iCalc = new ICalcImpl();

        // 根据目标对象iCalc，动态生成一个代理对象
        ICalc proxy = (ICalc) MyProxy.getProxy(iCalc, new MyInterceptorA());

        // 我们把proxy这个代理对象，再当成一个新的目标对象！
        ICalc proxy2 = (ICalc) MyProxy.getProxy(proxy, new MyInterceptorB());

        // 我们把proxy2这个代理对象，再当成一个新的目标对象！
        ICalc proxy3 = (ICalc) MyProxy.getProxy(proxy2, new MyInterceptorC());

        proxy3.add(1,2);

    }
}
