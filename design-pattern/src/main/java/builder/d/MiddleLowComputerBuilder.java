package builder.d;

/**
 * @ClassName: MiddleLowComputerBuilder
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 4:56 下午
 */
public class MiddleLowComputerBuilder implements IComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void setcpu() {
        computer.setCpu("i11 8899");
    }

    @Override
    public void setgpu() {
        computer.setGpu("7899");
    }

    @Override
    public void setMemory() {
        computer.setMemory("16G");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
