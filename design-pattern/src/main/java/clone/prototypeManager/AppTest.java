package clone.prototypeManager;

import clone.deepClone.Classes;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/6 9:36 下午
 */
public class AppTest {
    public static void main(String[] args) {
        PrototypeManager instance = PrototypeManager.getInstance();
        Citation_SanHao sanHao = new Citation_SanHao();
        Classes classes = new Classes();
        classes.setName("三级级二班");
        sanHao.setClasses(classes);
        sanHao.setName("张三");
        sanHao.setContent("在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
        sanHao.setSchool("徐信小学");

        Citation_Leader leader = new Citation_Leader();
        Classes classes1 = new Classes();
        classes1.setName("五年级1班");
        leader.setClasses(classes);
        leader.setName("李四");
        leader.setContent("在2020学年第一学期中表现优秀，被评为优秀班干部。特发此状！");
        leader.setSchool("徐信小学");

        instance.addDeepClone("sanHao", sanHao);
        instance.addDeepClone("leader", leader);

        System.out.println("获取实例");

        Citation_SanHao deepCloneSanHao = null;
        Citation_Leader deepCloneLeader = null;
        try {
            deepCloneSanHao = (Citation_SanHao)instance.getDeepClone("sanHao");
            deepCloneLeader = (Citation_Leader)instance.getDeepClone("leader");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        deepCloneSanHao.getClasses().setName("八年级2班");
        deepCloneLeader.getClasses().setName("八年级2班");

        sanHao.display();
        System.out.println("-------------");
        deepCloneSanHao.display();
        System.out.println("-------------");
        leader.display();
        System.out.println("-------------");
        deepCloneLeader.display();
    }
}
