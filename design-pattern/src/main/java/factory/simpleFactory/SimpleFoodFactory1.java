package factory.simpleFactory;

import factory.Food;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: SimpleFoodFactory1
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/1 9:56 下午
 */
public class SimpleFoodFactory1 {

    // 1. 定义容器对象存储咖啡对象
    private static Map<String, Food> beanMap = new HashMap<>();

    // 2. 加载配置文件，只需加载一次
    static {
        // 2.1 创建properties对象
        Properties properties = new Properties();
        // 2.2 调用properties对象中的load方法进行配置文件的加载
        InputStream resourceAsStream = SimpleFoodFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        try {
            properties.load(resourceAsStream);
            // 从p集合中获取全类名，并创建对象
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty(((String) key));
                // 通过反射技术创建对象
                Class aClass = Class.forName(className);
                Food food = ((Food) aClass.newInstance());
                // 将名称和对象存储到容器中
                beanMap.put((String) key, food);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 根据名称获取对象
    public static Food getFood(String className) {
        return beanMap.get(className);
    }
}
