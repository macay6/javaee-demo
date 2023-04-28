package memento.a;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/1 2:37 下午
 */
public class AppTest {

    public static void main(String[] args) {
        System.out.println("------------大战Boss前-----------");
        //大战Boss前
        GameRole gameRole = new GameRole();
        // 初始化状态
        gameRole.setHp(100);
        gameRole.setAtk(100);
        gameRole.setDef(100);
        gameRole.display();

        //保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("------------大战Boss后------------");
        //大战Boss时，损耗严重
        gameRole.setHp(80);
        gameRole.setAtk(120);
        gameRole.setDef(120);
        gameRole.display();


        System.out.println("------------恢复之前状态------------");
        //恢复之前状态
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.display();
    }
}
