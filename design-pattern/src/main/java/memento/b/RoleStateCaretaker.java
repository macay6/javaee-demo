package memento.b;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: RoleStateCaretaker
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/1 2:32 下午
 */
// 角色状态管理者类
public class RoleStateCaretaker {

    /**
     * 记录被保存的单个备忘录对象
     */
    private Memento memento;

    /**
     * 通过索引记录备忘录对象
     */
    private Map<String, Memento> mementoMap = new HashMap<>();

    // 还可以是其他集合形式

    public Memento getRoleStateMemento() {
        return memento;
    }

    public void setRoleStateMemento(Memento memento) {
        this.memento = memento;
    }

    public void setMementoDate(String process, Memento memento) {
        mementoMap.put(process, memento);
    }

    public Memento getMemento(String process) {
        return mementoMap.get(process);
    }
}
