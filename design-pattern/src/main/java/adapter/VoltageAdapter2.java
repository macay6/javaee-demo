package adapter;

/**
 * @ClassName: VoltageAdapter
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/28 11:15 上午
 */
//适配器类（需要实现目标接口）
public class VoltageAdapter2 implements IVoltage5V{

    private Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        // 先获取到220v电压,继承父类的output220V()方法。
        int src = voltage220V.output220V();
        return src/44;
    }
}
