package flyweight.inner;

/**
 * @ClassName: Coordinates
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/26 9:30 下午
 */
//坐标类：外部状态类
public class Coordinates {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
