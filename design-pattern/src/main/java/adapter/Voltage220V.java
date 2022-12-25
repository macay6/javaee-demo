package adapter;

/**
 * @ClassName: Voltage220V
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/28 11:10 上午
 */
//被适配的类
public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
