package builder.a;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/31 3:20 下午
 */
public class AppTest {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer computer = computerBuilder.builder();
        System.out.println(computer);
    }
}
