package adapter.other;

import adapter.IVoltage5V;

/**
 * @ClassName: VoltageAdapter3
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/28 11:59 上午
 */
public class VoltageAdapter3 implements IVoltage5V {

    private IVoltage voltage;

    public void setVoltage(IVoltage voltage) {
        this.voltage = voltage;
    }

    @Override
    public int output5V() {
        int src = voltage.outputV();
        System.out.println("通过一定方式将" + src + "V" +"电压转换为5V");
        return 5;
    }
}
