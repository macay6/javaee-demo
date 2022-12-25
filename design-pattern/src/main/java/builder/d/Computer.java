package builder.d;

/**
 * @ClassName: Computer
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 2:40 下午
 */
public class Computer {
    private String cpu;

    private String gpu;

    private String memory;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
