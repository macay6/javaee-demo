package creatThread;

/**
 * @ClassName: MyThreadTest2
 * @Description: 实现runnable接口
 * @Author: Macay
 * @Date: 2021/2/9 4:55 下午
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        new Thread(new MyRunnable1(), "线程1").start();
        new Thread(new MyRunnable2(), "线程2").start();
    }

    static class MyRunnable1 implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-------第" + i + "次执行");
            }
        }
    }

    static class MyRunnable2 implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-------第" + i + "次执行");
            }
        }
    }
}
