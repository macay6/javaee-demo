package proxy.jdk.i;

import java.lang.reflect.Method;

/**
 * @ClassName: MyInterceptorB
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/18 11:04 上午
 */
public class MyInterceptorB implements MyInterceptor {
    @Override
    public void before(Method method, Object[] args) {
        System.out.println("BBBBBBB开始");
    }

    @Override
    public void after(Method method, Object result) {
        System.out.println("BBBBBBB结束");
    }
}
