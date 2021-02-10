package creatThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName: MyCallableTest
 * @Description: 实现callable接口
 * @Author: Macay
 * @Date: 2021/2/9 5:17 下午
 */
public class MyCallableTest {
    public static void main(String[] args) {
        // 2、执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。
        // 使用FutureTask类来包装Callable对象，该FutureTask对象封装了Callable对象的call()方法的返回值
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable1());
        // 3、使用FutureTask对象作为Thread对象的target创建并启动线程（因为FutureTask实现了Runnable接口）
        new Thread(futureTask).start();
        Integer integer = null;
        try {
            // 4、调用FutureTask对象的get()方法来接受子线程执行结束后的返回值，所有的线程没有执行完成之后这里是不会执行的
            integer = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(integer);

    }
}

// 1、创建Callable接口的实现类，并实现call()方法,然后创建该实现类的实例。
class MyCallable1 implements Callable<Integer> {
    // 方法的返回值类型与上面Callable后面的泛型一致
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        return sum;
    }
}

