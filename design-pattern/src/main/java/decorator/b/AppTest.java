package decorator.b;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/29 10:02 下午
 */
public class AppTest {
    public static void main(String[] args) {
        FastFood firedRice = new FiredRice();
        firedRice.setHasEgg(true);
        firedRice.setHasBaconic(true);
        FastFood firedNoodles = new FiredNoodles();
        firedNoodles.setHasEgg(true);
        firedNoodles.setHasBaconic(true);
        firedNoodles.setHasHam(true);


        System.out.println(firedRice.getDesc() + ":" + firedRice.cost() + "元");
        System.out.println(firedNoodles.getDesc() + ":" + firedNoodles.cost() + "元");

    }
}
