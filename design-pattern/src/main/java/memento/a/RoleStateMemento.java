package memento.a;

/**
 * @ClassName: RoleStateMemento
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/1 2:26 下午
 */
// 游戏状态存储类(备忘录类)
public class RoleStateMemento {

    // 生命值
    private int hp;

    // 攻击力
    private int atk;

    // 防御力
    private int def;

    public RoleStateMemento() {
    }

    public RoleStateMemento(int hp, int atk, int def) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
