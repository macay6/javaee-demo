package principle.dependenceInversionPrinciple;

/**
 * @ClassName: AppTest2
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 5:44 下午
 */
public class AppTest2 {
    public static void main(String[] args) {
        Cpu intelCpu = new IntelCpu();
        Memory kinstonMemory = new KinstonMemory();
        Computer2 computer2 = new Computer2(intelCpu, kinstonMemory);
        computer2.run();
    }
}
