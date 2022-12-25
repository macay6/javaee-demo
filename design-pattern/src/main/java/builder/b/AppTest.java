package builder.b;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 3:20 下午
 */
public class AppTest {
    public static void main(String[] args) {
        AdvancedComputerBuilder advancedComputerBuilder = new AdvancedComputerBuilder();
        MiddleComputerBuilder middleComputerBuilder = new MiddleComputerBuilder();
        LowerComputerBuilder lowerComputerBuilder = new LowerComputerBuilder();

        // 玩游戏
        Computer c1 = advancedComputerBuilder.build();
        System.out.println(c1);

        // 开发
        Computer c2 = middleComputerBuilder.build();
        System.out.println(c2);

        // 办公娱乐
        Computer c3 = lowerComputerBuilder.build();
        System.out.println(c3);

    }
}
