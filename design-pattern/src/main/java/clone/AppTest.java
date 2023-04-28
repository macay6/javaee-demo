package clone;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/6 3:33 下午
 */
public class AppTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setName("张三");
        citation.setContent("在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
        citation.setSchool("徐信小学");
        System.out.println("=========通过clone生成新对象===========");
        Citation clone = (Citation) citation.clone();
        clone.setName("李四");
        citation.show();
        clone.show();
    }
}
