package decorator.b;

/**
 * @ClassName: FastFood
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/29 9:36 下午
 */
// 快餐抽象类
public abstract class FastFood {
    // 描述
    private String desc;

    // 价格
    private double price;

    // 是否添加鸡蛋
    private boolean hasEgg;

    // 是否添加火腿
    private boolean hasHam;

    // 是个添加培根
    private boolean hasBaconic;

    public void setHasEgg(boolean hasEgg) {
        this.hasEgg = hasEgg;
    }

    public void setHasHam(boolean hasHam) {
        this.hasHam = hasHam;
    }

    public void setHasBaconic(boolean hasBaconic) {
        this.hasBaconic = hasBaconic;
    }

    public boolean isHasEgg() {
        return hasEgg;
    }

    public boolean isHasHam() {
        return hasHam;
    }

    public boolean isHasBaconic() {
        return hasBaconic;
    }

    public FastFood() {
    }

    public FastFood(String desc, double price) {
        this.desc = desc;
        this.price = price;
    }

    public String getDesc() {
        StringBuilder sb = new StringBuilder();
        sb.append(desc);
        if (hasEgg) {
            sb.append("+鸡蛋");
        }
        if (hasHam) {
            sb.append("+火腿");
        }
        if (hasBaconic) {
            sb.append("+培根");
        }
        return sb.toString();
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
    public  double cost(){
        double total = 0;
        if (hasEgg) {
            total += 1;
        }
        if (hasHam) {
            total += 2;
        }
        if (hasBaconic) {
            total += 3;
        }
        return total;
    }
}
