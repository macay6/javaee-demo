package waitAndNotify;

/**
 * @ClassName: ResourceTest
 * @Description:
 * @Author: Macay
 * @Date: 2021/3/5 10:09 下午
 */
class Resource {
    private int number = 0;

    // 数量加1
    public void increase() {

    }

    // 数量减1
    public void decrease() {

    }
}



public class ResourceTest {
    public static void main(String[] args) {
        new Thread(() -> {

        }, "A").start();
    }
}
