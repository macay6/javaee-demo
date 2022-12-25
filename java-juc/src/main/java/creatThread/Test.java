package creatThread;

/**
 * @ClassName: Test
 * @Description:
 * @Author: Macay
 * @Date: 2021/2/10 6:07 下午
 */
public class Test {
    public static void main(String[] args) {
        Thread mythread = new MyThread("mythread");
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            mythread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mythread.run();
        mythread.start();
    }
}


class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
