package flyweight.inner;

/**
 * @ClassName: WhiteIgoChessman
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/25 9:43 下午
 */
//白色棋子类：具体享元类
public class WhiteIgoChessman extends IgoChessman{
    @Override
    public String getColor() {
        return "白色";
    }
}
