package builder.c;

/**
 * @ClassName: IComputerBuilder
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 4:20 下午
 */
public interface IComputerBuilder {
    void setcpu();
    void setgpu();
    void setMemory();
    Computer build();
}
