package decorator.c;

/**
 * @ClassName: Ham
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/1 9:32 下午
 */
public class Ham extends Fixings{

    public Ham(FastFood fastFood) {
        super(fastFood, "+火腿", 2);
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
