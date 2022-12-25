/**
 * @ClassName: Test
 * @Description:
 * @Author: Macay
 * @Date: 2021/2/2 12:48 上午
 */
public class Test {
    public static void main(String[] args) {
        // 获取cpu的核数
        System.out.println(Runtime.getRuntime().availableProcessors());
        // 设置当前线程名
        Thread.currentThread().setName("myThread");
        // 获取当前线程名
        String name = Thread.currentThread().getName();
        System.out.println(name);
//        Thread.State
    }
}
