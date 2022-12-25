package proxy.jdk.i;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: MyHandler
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 4:22 下午
 */
public class MyHandler implements InvocationHandler {
    private Object target;

    private MyInterceptor interceptor;

    public MyHandler(Object target, MyInterceptor interceptor) {
        this.target = target;
        this.interceptor = interceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 前置通知，决定权交给用户
        interceptor.before(method, args);

        // 利用反射机制，调用方法
        // 把method所代表的方法，当做target对象的方法调用，参数是args
        Object result = method.invoke(target, args);

        // 后置通知，决定权交给用户
        interceptor.after(method, result);
        return result;  // 这里的返回值，会返回到代理对象的方法调用处
    }
}
