package adapter;

/**
 * @ClassName: VoltageAdapter
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/28 11:15 上午
 */
//适配器类（需要继承被适配的类）
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        // 先获取到220v电压,继承父类的output220V()方法。
        int src = output220V();
        return src/44;
    }
}
