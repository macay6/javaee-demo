package templatemethod;

/**
 * @ClassName: Cook_QieZi
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/3 10:11 下午
 */
public class Cook_QieZi extends Cook{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是茄子");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
