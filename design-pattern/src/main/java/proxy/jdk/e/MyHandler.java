package proxy.jdk.e;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName: MyHandler
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 4:22 下午
 */
public class MyHandler implements InvocationHandler {
    private Object target;

    public MyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "开始，参数是：" + Arrays.toString(args));
        // 利用反射机制，调用方法
        // 把method所代表的方法，当做target对象的方法调用，参数是args
        Object result = method.invoke(target, args);
        System.out.println(method.getName() + "结束，结果是：" + result);
        return result;  // 这里的返回值，会返回到代理对象的方法调用处
    }
}
