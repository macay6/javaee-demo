package adapter.other;

/**
 * @ClassName: Voltage220V
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/28 11:57 上午
 */
// 220V
public class Voltage220V implements IVoltage{
    @Override
    public int outputV() {
        return 220;
    }
}
