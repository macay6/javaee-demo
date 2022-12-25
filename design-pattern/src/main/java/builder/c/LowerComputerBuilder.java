package builder.c;

/**
 * @ClassName: ComputerBuilder
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 3:39 下午
 */
// 低配电脑建造者类
public class LowerComputerBuilder implements IComputerBuilder{
    private Computer computer = new Computer();

    @Override
    public void setcpu() {
        computer.setCpu("i5 5505");
    }

    @Override
    public void setgpu() {
        computer.setGpu("gt340mx");
    }

    @Override
    public void setMemory() {
        computer.setMemory("8g");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
