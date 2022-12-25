package proxy.jdk.d;

import java.lang.reflect.Proxy;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 2:37 下午
 */
public class AppTest {
    public static void main(String[] args) {
        // 获取类加载器
        ClassLoader classLoader = AppTest.class.getClassLoader();
        // 获取字节码数组
        Class[] interfaces = {ICalc.class};
        // 因为动态创建的代理对象的字节码实现了ICalc接口，所有可以强转为ICalc对象
        ICalc proxy = (ICalc) Proxy.newProxyInstance(classLoader, interfaces, new MyHandler(new ICalcImpl()));
        proxy.add(1,2);
        proxy.mul(1,2);
        proxy.sub(1,2);
        proxy.div(1,2);

        System.out.println(proxy.getClass());


    }
}
