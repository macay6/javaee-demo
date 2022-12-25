package observer.d;

/**
 * @ClassName: Panel1
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 6:02 下午
 */
public class Panel2 implements Observer {
    private Role role;

    public Panel2(Role role) {
        this.role = role;
    }

    @Override
    public void update() {
        System.out.println("面板2更新hp:" + role.getHp());
    }
}
