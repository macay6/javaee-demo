package basicDemo;

import java.util.Date;

/**
 * @ClassName: ThreadProgramma
 * @Description:
 * @Author: Macay
 * @Date: 2021/2/6 12:18 上午
 */
public class ThreadProgramma {
    public static void main(String[] args) {
        // 多线程编程：一边炒菜一边煮面
        new Cooking().start();
        new Noodles().start();
    }

    static class Cooking extends Thread {
        @Override
        public void run() {
            System.out.println("开始炒菜...\t" + new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束炒菜...\t" + new Date());
        }
    }

    static class Noodles extends Thread {
        @Override
        public void run() {
            System.out.println("开始煮面...\t" + new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束煮面...\t" + new Date());
        }
    }
}
