package builder.b;

/**
 * @ClassName: ComputerBuilder
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 3:39 下午
 */
// 高配电脑建造者类
public class AdvancedComputerBuilder {
    private Computer computer = new Computer();

    public Computer build() {
        computer.setCpu("i9 5505");
        computer.setGpu("gt940mx");
        computer.setMemory("32g");
        return computer;
    }
}
