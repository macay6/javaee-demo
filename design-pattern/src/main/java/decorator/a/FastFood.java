package decorator.a;

/**
 * @ClassName: FastFood
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/29 9:36 下午
 */
// 快餐抽象类
public abstract class FastFood {

    private String desc;

    private double price;

    public FastFood() {
    }

    public FastFood(String desc, double price) {
        this.desc = desc;
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 获取价格，抽象接口，具体子类实现
    public abstract double cost();

}
