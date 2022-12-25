package templatemethod;

/**
 * @ClassName: Cook
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/3 9:58 下午
 */
// 抽象类，模板方法模式必须是抽象类
public abstract class Cook {

    // 模板方法，此方法是算法的骨架，因此常做成final的，不让子类去复写
    public final void cookProcess() {
        // 第一步：倒油
        this.pourOil();
        // 第二步：热油
        this.heatOil();
        // 第三步：倒蔬菜，抽象方法
        this.pourVegetable();
        // 第四步：倒调味料，抽象方法, 是否需要由sPourSauce()钩子函数决定i，子类根据自己的情况决定
        if(isPourSauce()) {
           this.pourSauce();
        }
        // 第五步：翻炒
        this.fry();
    }

    // 第一步：倒油是一样的，所以直接实现
    public void pourOil() {
        System.out.println("倒油");
    }

    // 第二步：热油是一样的，所以直接实现
    public void heatOil() {
        System.out.println("热油");
    }
    // 第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
    public abstract void pourVegetable();

    // 第四步：倒调味料是不一样
    public abstract void pourSauce();

    // 第五步：翻炒是一样的，所以直接实现
    public void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }
    // 钩子方法，决定是否要添加调料，默认添加
    public boolean isPourSauce() {
        return true;
    }
}
