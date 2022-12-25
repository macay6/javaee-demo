package observer.d;

/**
 * @ClassName: Panel1
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 6:02 下午
 */
public class Panel1 implements Observer {
    private Role role;

    public Panel1(Role role) {
        this.role = role;
    }

    @Override
    public void update() {
        System.out.println("面板1更新hp:" + role.getHp());
    }
}
