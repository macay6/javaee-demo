package memento.b;

/**
 * @ClassName: GameRole
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/1 2:09 下午
 */
// 游戏角色
public class GameRole {
    // 生命值
    private int hp;

    // 攻击力
    private int atk;

    // 防御力
    private int def;

    // 其他属性

    // 保存角色状态，实质上是创建一个备忘录类
    public Memento saveState() {
        return new RoleStateMemento(hp, atk, def);
    }

    // 恢复角色状态
    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.hp = roleStateMemento.getHp();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }


    public void display() {
        System.out.println("生命值为：" + getHp());
        System.out.println("攻击力为：" + getAtk());
        System.out.println("防御力为：" + getDef());
    }

    /**
     * 真正的备忘录对象，实现了备忘录窄接口 实现成私有的内部类，不让外部访问
     */
    private class RoleStateMemento implements Memento {

        // 生命值
        private int hp;

        // 攻击力
        private int atk;

        // 防御力
        private int def;

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
