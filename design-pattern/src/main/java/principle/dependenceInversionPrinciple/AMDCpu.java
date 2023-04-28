package principle.dependenceInversionPrinciple;

/**
 * @ClassName: AMDCpu
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 4:31 下午
 */
public class AMDCpu implements Cpu {

    @Override
    public void run() {
        System.out.println("AMDCpu跑起来了");
    }
}
