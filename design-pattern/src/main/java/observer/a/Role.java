package observer.a;

/**
 * @ClassName: Role
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 5:05 下午
 */
public class Role {

    private Integer hp;

    private Integer mp;

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
        // 当hp发生变化的时候，需要通知3个地方：
        System.out.println("血条更新为：" + hp);
        System.out.println("面板1更新为：" + hp);
        System.out.println("面板2更新为：" + hp);
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }
}
