package principle.dependenceInversionPrinciple;

/**
 * @ClassName: AppTest1
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 5:35 下午
 */
public class AppTest1 {
    public static void main(String[] args) {
        Computer1 computer1 = new Computer1();
        Cpu intelCpu = new IntelCpu();
        Memory samSungMemory = new SamSungMemory();
        computer1.run(intelCpu, samSungMemory);
    }
}
