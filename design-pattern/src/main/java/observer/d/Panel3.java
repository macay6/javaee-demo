package observer.d;

/**
 * @ClassName: Panel1
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 6:02 下午
 */
public class Panel3 implements Observer {
    private Role role;

    public Panel3(Role role) {
        this.role = role;
    }

    @Override
    public void update() {
        System.out.println("面板3更新hp:" + role.getHp());
    }
}
