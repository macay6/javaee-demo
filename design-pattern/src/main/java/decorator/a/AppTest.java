package decorator.a;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/29 10:02 下午
 */
public class AppTest {

    public static void main(String[] args) {
        FastFood firedRice = new FiredRice();
        FastFood firedNoodles = new FiredNoodles();
        FastFood firedFans = new FiredFans();

        System.out.println(firedRice.getDesc() + ":" + firedRice.cost() + "元");
        System.out.println(firedNoodles.getDesc() + ":" + firedNoodles.cost() + "元");
        System.out.println(firedFans.getDesc() + ":" + firedFans.cost() + "元");
    }
}
