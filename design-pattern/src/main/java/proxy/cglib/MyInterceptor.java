package proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: MyInterceptor
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/24 11:48 上午
 */
public class MyInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB 调用前");
        Object result = methodProxy.invokeSuper(obj, objects);
        System.out.println("CGLIB 调用后");
        return result;
    }
}
