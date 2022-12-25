package decorator.c;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/29 10:02 下午
 */
public class AppTest {
    public static void main(String[] args) {
        FastFood firedRice = new FiredRice();
        FastFood egg = new Egg(firedRice);

        FastFood ham = new Ham(egg);
        FastFood ham1 = new Ham(firedRice);
        FastFood ham2 = new Ham(ham1);

        System.out.println(firedRice.getDesc() + ":" + firedRice.cost() + "元");
        System.out.println(egg.getDesc() + ":" + egg.cost() + "元");
        System.out.println(ham.getDesc() + ":" + ham.cost() + "元");
        System.out.println(ham1.getDesc() + ":" + ham1.cost() + "元");
        System.out.println(ham2.getDesc() + ":" + ham2.cost() + "元");

    }
}
