package decorator.c;

/**
 * @ClassName: Fixings
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/1 9:15 下午
 */
public abstract class Fixings extends FastFood {

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Fixings(FastFood fastFood, String desc, double price) {
        super(desc, price);
        this.fastFood = fastFood;
    }
}
