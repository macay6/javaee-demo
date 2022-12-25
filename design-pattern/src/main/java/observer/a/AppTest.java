package observer.a;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 5:11 下午
 */
public class AppTest {
    public static void main(String[] args) {
        Role role = new Role();
        role.setHp(100);
        role.setMp(100);
        // 被攻击
        role.setHp(role.getHp() -10);
    }
}
