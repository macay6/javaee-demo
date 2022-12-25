package flyweight.inner;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: IgoChessmanFactory
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/25 9:49 下午
 */
public class IgoChessmanFactory {

    // //定义一个HashMap用于存储享元对象，实现享元池
    private static Map<String, IgoChessman> pool = new HashMap<>();

    private IgoChessmanFactory() {
        pool.put("b",new BlackIgoChessman());
        pool.put("w", new WhiteIgoChessman());
    }

    private static IgoChessmanFactory instance = new IgoChessmanFactory();

    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    public IgoChessman getIgoChessman(String color) {
        return pool.get(color);
    }
}
