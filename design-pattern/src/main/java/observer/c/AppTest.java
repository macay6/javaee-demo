package observer.c;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 5:11 下午
 */
public class AppTest {
    public static void main(String[] args) {
        Role role = new Role();
        Panel1 panel1 = new Panel1();
        Panel2 panel2 = new Panel2();
        Panel3 panel3 = new Panel3();
        role.addObserver(panel1);
        role.addObserver(panel2);
        role.addObserver(panel3);

        role.setHp(100);
        // 被攻击
        role.setHp(role.getHp() -10);
        role.notifyObservers();
    }
}
