package command.b;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Waiter
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/25 1:36 下午
 */
public class Waiter {

    // 可以持有很多的命令对象
    private List<Command> commandList = new ArrayList<>();

    public void setCommond(Command commond) {
        commandList.add(commond);
    }

    // 发出命令 喊 订单来了，厨师开始执行
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (Command command : commandList) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
