package principle.dependenceInversionPrinciple;

/**
 * @ClassName: Computer
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 2:40 下午
 */
public class Computer {
    private Cpu cpu;

    private Memory memory;

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }


    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run() {
        cpu.run();
        memory.save();
    }
}
