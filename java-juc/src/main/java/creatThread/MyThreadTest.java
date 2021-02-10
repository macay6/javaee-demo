package creatThread;

/**
 * @ClassName: MyThread1
 * @Description: 继承Thread类
 * @Author: Macay
 * @Date: 2021/2/9 3:16 下午
 */
public class MyThreadTest {
    public static void main(String[] args) {
        Thread thread1 = new MyThread1("线程1");
        Thread thread2 = new MyThread2("线程2");
        thread1.start();
        thread2.start();

    }
    static class MyThread1 extends Thread {
        public MyThread1(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "-------第" + i + "次执行");
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }
    static class MyThread2 extends Thread {
        public MyThread2(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "-------第" + i + "次执行");
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }
}
