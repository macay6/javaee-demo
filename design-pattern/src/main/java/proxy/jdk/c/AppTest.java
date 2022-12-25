package proxy.jdk.c;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 1:48 下午
 */
public class AppTest {
    public static void main(String[] args) {
        MyIcalcImpl myIcalc = new MyIcalcImpl();
        myIcalc.add(1, 2);
        myIcalc.sub(1, 2);
        myIcalc.mul(1, 2);
        myIcalc.div(10, 2);
    }
}
