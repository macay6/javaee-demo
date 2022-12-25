package proxy.jdk.h;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName: AddInterceptor
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/18 1:27 下午
 */
public class DivInterceptor implements MyInterceptor{
    @Override
    public void before(Method method, Object[] args) {
        if ("div".equals(method.getName())) {
            System.out.println(method.getName() + "start，args：" + Arrays.toString(args));
        }
    }

    @Override
    public void after(Method method, Object result) {
        if ("div".equals(method.getName())) {
            System.out.println(method.getName() + "end，result：" + result);
        }
    }
}
