package principle.dependenceInversionPrinciple;

/**
 * @ClassName: Computer2
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 5:42 下午
 */
public class Computer2 {

    private Cpu cpu;

    private Memory memory;

    public Computer2(Cpu cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public void run() {
        this.cpu.run();
        this.memory.save();
    }
}
