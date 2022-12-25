package clone.prototypeManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: PrototypeManager
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/6 9:26 下午
 */
public class PrototypeManager {

    private Map<String, AbstractDeepClone> map = new HashMap<>();

    private PrototypeManager() {

    }

    private static PrototypeManager instance = new PrototypeManager();

    public static PrototypeManager getInstance() {
        return instance;
    }

    public void addDeepClone(String key, AbstractDeepClone abstractDeepClone) {
        map.put(key, abstractDeepClone);
    }

    public AbstractDeepClone getDeepClone(String key) throws CloneNotSupportedException {
       return ((AbstractDeepClone) map.get(key)).clone();
    }
}
