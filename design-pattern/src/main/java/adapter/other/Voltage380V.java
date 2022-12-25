package adapter.other;

/**
 * @ClassName: Voltage380V
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/28 11:58 上午
 */
public class Voltage380V implements IVoltage{
    @Override
    public int outputV() {
        return 330;
    }
}
