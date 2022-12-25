package builder.d;

/**
 * @ClassName: Director
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 4:42 下午
 */
public class Director {
    public Computer build(IComputerBuilder cb) {
        cb.setcpu();
        cb.setgpu();
        cb.setMemory();
        Computer computer = cb.build();
        return computer;
    }
}
