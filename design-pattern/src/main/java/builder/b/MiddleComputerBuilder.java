package builder.b;

/**
 * @ClassName: ComputerBuilder
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 3:39 下午
 */
// 中配电脑建造者类
public class MiddleComputerBuilder {
    private Computer computer = new Computer();

    public Computer build() {
        computer.setCpu("i7 5505");
        computer.setGpu("gt640mx");
        computer.setMemory("16g");
        return computer;
    }
}
