package proxy.jdk.a;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 1:48 下午
 */
public class AppTest {

    public static void main(String[] args) {
        ICalcImpl iCalc = new ICalcImpl();
        System.out.println(iCalc.add(1, 2));
        System.out.println(iCalc.sub(1, 2));
        System.out.println(iCalc.mul(1, 2));
        System.out.println(iCalc.div(10, 2));
    }
}
