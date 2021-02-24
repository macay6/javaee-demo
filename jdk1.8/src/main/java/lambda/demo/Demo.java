package lambda.demo;

/**
 * @ClassName: Demo
 * @Description:
 * @Author: Macay
 * @Date: 2021/2/21 7:54 下午
 */
public interface Demo {
    public void hello ();

    default void sayHello() {
        System.out.println("hrllo default");
    }

    public static int add (int a, int b) {
        return a+b;
    }
}
