package observer.c;

/**
 * @ClassName: Panel1
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 6:02 下午
 */
public class Panel1 implements Observer {
    @Override
    public void update(Role role) {
        System.out.println("面板1更新hp:" + role.getHp());
    }
}
