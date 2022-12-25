package proxy.jdk.h;

import java.lang.reflect.Method;

/**
 * @ClassName: MyInterceptor
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/18 10:56 上午
 */
public interface MyInterceptor {
    void before(Method method, Object[] args);
    void after(Method method, Object result);
}
