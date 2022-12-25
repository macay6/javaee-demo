package clone.deepClone;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/6 3:33 下午
 */
public class AppTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Classes classes = new Classes();
        classes.setName("三级级二班");
        citation.setClasses(classes);
        citation.setName("张三");
        citation.setContent("在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
        citation.setSchool("徐信小学");
        Citation clone = (Citation) citation.clone();

        clone.getClasses().setName("四年级一班");
        clone.setName("李四");
        citation.show();
        System.out.println("=========通过clone生成新对象===========");
        clone.show();

        System.out.println("citation.getClasses()和clone.getClasses()是同一个对象？" );
        System.out.println(citation.getClasses() == clone.getClasses());
    }
}
