package basicDemo;

import java.util.Date;

/**
 * @ClassName: basicDemo.OrderProgramma
 * @Description:
 * @Author: Macay
 * @Date: 2021/2/6 12:11 上午
 */
public class OrderProgramma {
    public static void main(String[] args) throws Exception {
        // 顺序编程：先炒菜再煮面
        cooking();
        noodles();

    }
    private static void cooking() throws Exception {
        System.out.println("开始炒菜...\t" + new Date());
        Thread.sleep(5000);
        System.out.println("结束炒菜...\t" + new Date());
    }

    private static void noodles() throws Exception {
        System.out.println("开始煮面...\t" + new Date());
        Thread.sleep(5000);
        System.out.println("结束煮面...\t" + new Date());
    }
}
