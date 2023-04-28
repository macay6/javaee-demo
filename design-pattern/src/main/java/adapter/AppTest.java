package adapter;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/28 11:20 上午
 */
public class AppTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.charging(new VoltageAdapter2(new Voltage220V()));
    }
}
