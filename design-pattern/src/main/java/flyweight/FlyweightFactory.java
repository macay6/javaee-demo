package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: FlyweightFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/25 9:16 下午
 */
public class FlyweightFactory {

    // //定义一个HashMap用于存储享元对象，实现享元池
    private static Map<String, IFlyweight> pool = new HashMap<>();

    public static IFlyweight getFlyweight(String intrinsicState) {
        // 如果对象不存在，先创建一个新的对象添加到享元池中，然后返回
        if(!pool.containsKey(intrinsicState)) {
            pool.put(intrinsicState, new ConcreteFlyweight(intrinsicState));
        }
        // 如果对象存在，则直接从享元池获取
        return pool.get(intrinsicState);
    }
}
