package builder.d;

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

        // 指挥者
        Director director = new Director();

        // 玩游戏
        Computer c1 = director.build(advancedComputerBuilder);
        System.out.println(c1);

        // 开发
        Computer c2 = director.build(middleComputerBuilder);
        System.out.println(c2);

        // 办公娱乐
        Computer c3 = director.build(lowerComputerBuilder);
        System.out.println(c3);

        // 中高配电脑
        MiddleLowComputerBuilder middleLowComputerBuilder = new MiddleLowComputerBuilder();
        Computer c4 = director.build(middleLowComputerBuilder);
        System.out.println(c4);

    }
}
