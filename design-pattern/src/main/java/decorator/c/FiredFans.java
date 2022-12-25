package decorator.c;

/**
 * @ClassName: FiredFans
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/29 10:00 下午
 */
public class FiredFans extends FastFood {
    public FiredFans() {
        super("炒粉", 8);
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
