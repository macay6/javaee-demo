package observer.b;

/**
 * @ClassName: Panel1
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 6:02 下午
 */
public class Panel3 implements Observer{
    @Override
    public void update(int hp) {
        System.out.println("面板3更新hp:" + hp);
    }
}
