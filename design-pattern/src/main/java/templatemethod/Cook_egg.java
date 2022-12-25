package templatemethod;

/**
 * @ClassName: Cook_egg
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/4 10:13 下午
 */
public class Cook_egg extends Cook{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的是鸡蛋");
    }

    // 钩子方法，返回false表示不放调料
    @Override
    public boolean isPourSauce() {
        return false;
    }

    @Override
    public void pourSauce() {
        System.out.println("不想放调料");
    }
}
