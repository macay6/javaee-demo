package flyweight.inner;

/**
 * @ClassName: BlackIgoChessman
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/25 9:42 下午
 */

//黑色棋子类：具体享元类
public class BlackIgoChessman extends IgoChessman{
    @Override
    public String getColor() {
        return "黑色";
    }
}
