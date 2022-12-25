package memento.a;

/**
 * @ClassName: RoleStateCaretaker
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/1 2:32 下午
 */
// 角色状态管理者类
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;


    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
