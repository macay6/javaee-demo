package decorator.c;

/**
 * @ClassName: Egg
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/1 9:20 下午
 */
public class Egg extends Fixings{

    public Egg(FastFood fastFood) {
        super(fastFood, "+鸡蛋", 1);
    }

    @Override
    public double cost() {
        return getFastFood().cost() + getPrice();
    }

    @Override
    public String getDesc() {
        return getFastFood().getDesc() + super.getDesc();
    }
}
