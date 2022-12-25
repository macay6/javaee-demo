package builder.d;

/**
 * @ClassName: ComputerBuilder
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 3:39 下午
 */
// 中配电脑建造者类
public class MiddleComputerBuilder implements IComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void setcpu() {
        computer.setCpu("i7 5505");
    }

    @Override
    public void setgpu() {
        computer.setGpu("gt640mx");
    }

    @Override
    public void setMemory() {
        computer.setMemory("16g");
    }
    @Override
    public Computer build() {
        return computer;
    }
}
