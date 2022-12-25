package adapter.other;

import adapter.Computer;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/28 12:01 下午
 */
public class AppTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        VoltageAdapter3 adapter = new VoltageAdapter3();

        // 使用220电压充电
        System.out.println("使用220V电压充电......");
        IVoltage voltage220V = new Voltage220V();
        adapter.setVoltage(voltage220V);
        computer.charging(adapter);

        System.out.println("--------------------");

        // 使用380电压充电
        System.out.println("使用380电压充电......");
        IVoltage voltage380V = new Voltage380V();
        adapter.setVoltage(voltage380V);
        computer.charging(adapter);
    }
}
