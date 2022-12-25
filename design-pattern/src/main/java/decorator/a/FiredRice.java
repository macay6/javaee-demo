package decorator.a;

/**
 * @ClassName: FiredRice
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/29 9:49 下午
 */
public class FiredRice extends FastFood{
    public FiredRice() {
        super("炒米饭", 10);
    }

    @Override
    public double cost() {
        return getPrice();
    }
}
