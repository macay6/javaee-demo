package builder.b;

/**
 * @ClassName: ComputerBuilder
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 3:39 下午
 */
// 低配电脑建造者类
public class LowerComputerBuilder {
    private Computer computer = new Computer();

    public Computer build() {
        computer.setCpu("i5 5505");
        computer.setGpu("gt340mx");
        computer.setMemory("8g");
        return computer;
    }
}
