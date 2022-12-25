package observer.c;

/**
 * @ClassName: Observer
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 6:00 下午
 */
public interface Observer {
    // 需要一个方法来接收主题发来的数据
    public void update(Role role);
}
