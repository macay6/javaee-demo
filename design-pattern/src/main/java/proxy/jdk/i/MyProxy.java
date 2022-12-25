package proxy.jdk.i;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @ClassName: MyProxy
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/18 9:48 上午
 */
public class MyProxy {

    public static Object getProxy(Object target, MyInterceptor interceptor) {
        // 获取类加载器
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        // 获取target所属的类所实现的接口
        Class<?>[] interfaces = target.getClass().getInterfaces();
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, new MyHandler(target, interceptor));
        return proxy;
    }

    public static Object getProxy2(Object target, List<MyInterceptor> interceptors) {
        for (int i = interceptors.size() -1; i >= 0; i--) {
            MyInterceptor myInterceptor = interceptors.get(i);
            target = MyProxy.getProxy(target, myInterceptor);
        }
        return target;
    }
}
