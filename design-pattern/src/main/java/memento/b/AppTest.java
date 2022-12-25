package memento.b;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/1 2:37 下午
 */
public class AppTest {

    public static void main(String[] args) {
        System.out.println("------------大战Boss1前------------");
        //大战Boss前
        GameRole gameRole = new GameRole();
        // 初始化状态
        gameRole.setHp(100);
        gameRole.setAtk(100);
        gameRole.setDef(100);
        gameRole.display();

        //保存进度process1
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMementoDate("process1", gameRole.saveState());

        System.out.println("------------大战Boss1后------------");
        //大战Boss1时，损耗严重
        gameRole.setHp(80);
        gameRole.setAtk(120);
        gameRole.setDef(120);
        gameRole.display();

        // 保存进度process2
        roleStateCaretaker.setMementoDate("process2", gameRole.saveState());
        System.out.println("------------大战Boss2后------------");
        //大战Boss2时，损耗严重
        gameRole.setHp(60);
        gameRole.setAtk(150);
        gameRole.setDef(150);
        gameRole.display();

        System.out.println("-----------想回退到大战boss1前------------");
        gameRole.recoverState(roleStateCaretaker.getMemento("process1"));
        gameRole.display();


        System.out.println("-----------想回退到大战boss2前------------");
        gameRole.recoverState(roleStateCaretaker.getMemento("process2"));
        gameRole.display();
    }
}
