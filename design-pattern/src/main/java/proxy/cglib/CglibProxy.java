package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @ClassName: CglibProxy
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/24 11:58 上午
 */
public class CglibProxy {

    public static Object getProxy(Class<?>  clazz) {
        // 创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
        // 设置类加载
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置被代理类
        enhancer.setSuperclass(clazz);
        // 设置方法拦截器
        enhancer.setCallback(new MyInterceptor());
        // 创建代理类
        return enhancer.create();
    }
}
