package principle.dependenceInversionPrinciple;

/**
 * @ClassName: KinstonMemory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 2:42 下午
 */
public class KinstonMemory implements Memory {
    private String name;
    @Override
    public void save() {
        System.out.println("Kinston内存存东西");
    }
}
