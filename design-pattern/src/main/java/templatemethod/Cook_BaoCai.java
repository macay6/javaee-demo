package templatemethod;

/**
 * @ClassName: Cook_BaoCai
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/3 10:07 下午
 */
public class Cook_BaoCai extends Cook{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
