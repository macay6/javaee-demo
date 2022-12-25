package proxy.jdk.i;

import java.util.ArrayList;
import java.util.List;

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

        List<MyInterceptor> interceptors = new ArrayList<>();

        interceptors.add(new MyInterceptorA());
        interceptors.add(new MyInterceptorB());
        interceptors.add(new MyInterceptorC());

        ICalc proxy = (ICalc)MyProxy.getProxy2(iCalc, interceptors);

        proxy.add(1,2);

    }
}
