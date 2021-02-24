package TimeUnit;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: Demo
 * @Description:
 * @Author: Macay
 * @Date: 2021/2/24 10:55 下午
 */
public class SleepDemo {
    public static void main(String[] args) {
        //=============================休眠传统的写法==========================
        new Thread(() -> {
            try {
                Thread.sleep(5);
                System.out.println("传统延时完成了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        //=============================休眠TimeUnit写法==========================
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("TimeUnit延时完成了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
