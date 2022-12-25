package principle.dependenceInversionPrinciple;

/**
 * @ClassName: Computer1
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 5:34 下午
 */
public class Computer1 {

    public void run(Cpu cpu, Memory memory) {
       cpu.run();
       memory.save();
    }
}
