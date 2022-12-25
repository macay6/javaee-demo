package proxy.jdk.h;

import java.lang.reflect.Method;

/**
 * @ClassName: MyInterceptorA
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/18 10:59 上午
 */
public class MyInterceptorA implements MyInterceptor {
    @Override
    public void before(Method method, Object[] args) {
        System.out.println("AAAAAAA开始");
    }

    @Override
    public void after(Method method, Object result) {
        System.out.println("AAAAAAA结束");
    }
}
