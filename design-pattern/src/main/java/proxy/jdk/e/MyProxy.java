package proxy.jdk.e;

import java.lang.reflect.Proxy;

/**
 * @ClassName: MyProxy
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/18 9:48 上午
 */
public class MyProxy {

    public static Object getProxy(Object target) {
        // 获取类加载器
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        // 获取target所属的类所实现的接口
        Class<?>[] interfaces = target.getClass().getInterfaces();
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, new MyHandler(target));
        return proxy;
    }
}
