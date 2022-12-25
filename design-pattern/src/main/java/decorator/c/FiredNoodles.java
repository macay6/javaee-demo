package decorator.c;

/**
 * @ClassName: FiredNoodles
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/29 9:54 下午
 */
public class FiredNoodles extends FastFood {
    public FiredNoodles() {
        super("炒面", 12);
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
