package flyweight.inner;

/**
 * @ClassName: IgoChessman
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/25 9:40 下午
 */
//围棋棋子类：抽象享元类
public abstract class IgoChessman {

    public abstract String getColor();

    public void display(Coordinates coord) {
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY());
    }
}
