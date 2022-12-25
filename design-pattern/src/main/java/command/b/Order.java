package command.b;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Order
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/25 1:23 下午
 */
// 订单类
public class Order {

    // 餐桌号
    private int index;

    private Map<String, Integer> food = new HashMap<>();

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Map<String, Integer> getFood() {
        return food;
    }

    public void setFood(String foodName, Integer num) {
        food.put(foodName, num);
    }
}
