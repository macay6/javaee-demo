package principle.dependenceInversionPrinciple;

/**
 * @ClassName: SamSungMemory
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/24 4:33 下午
 */
public class SamSungMemory implements Memory{
    @Override
    public void save() {
        System.out.println("SamSungMemory内存存东西");
    }
}
