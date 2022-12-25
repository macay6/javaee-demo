package builder.a;

/**
 * @ClassName: ComputerBuilder
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 3:39 下午
 */
// 电脑配置类，建造者类，必须关联电脑产品
public class ComputerBuilder {
    private Computer computer = new Computer();

    public Computer builder() {
        computer.setCpu("i7 5505");
        computer.setGpu("gt940mx");
        computer.setMemory("16g");
        return computer;
    }
}
