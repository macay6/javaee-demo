package factory.abstractFactory;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 11:14 上午
 */
public class AppTest {
    public static void main(String[] args) {
        Bussiness.taste(new KFCFactory());
    }
}
