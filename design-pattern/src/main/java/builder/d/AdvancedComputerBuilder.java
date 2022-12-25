package builder.d;

/**
 * @ClassName: ComputerBuilder
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 3:39 下午
 */
// 高配电脑建造者类
public class AdvancedComputerBuilder implements IComputerBuilder {
    private Computer computer = new Computer();
    @Override
    public void setcpu() {
        computer.setCpu("i9 5505");
    }

    @Override
    public void setgpu() {
        computer.setGpu("gt940mx");
    }

    @Override
    public void setMemory() {
        computer.setMemory("32g");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
