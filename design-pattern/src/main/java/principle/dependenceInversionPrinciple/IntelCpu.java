package principle.dependenceInversionPrinciple;

/**
 * @ClassName: IntelCpu
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 2:40 下午
 */
public class IntelCpu implements Cpu{
    private String name;

    @Override
    public void run() {
        System.out.println("Intelcpu运行起来了");
    }
}
