package proxy.jdk.b;

/**
 * @ClassName: ICalcImpl
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 1:44 下午
 */
public class ICalcImpl implements ICalc {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法开始了，参数是：" + a + "," + b);
        int r = a + b;
        System.out.println("add方法结束了，结果是：" + r);
        return r;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("sub方法开始了，参数是：" + a + "," + b);
        int r = a - b;
        System.out.println("asub方法结束了，结果是：" + r);
        return r;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("mul方法开始了，参数是：" + a + "," + b);
        int r = a * b;
        System.out.println("mul方法结束了，结果是：" + r);
        return r;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("div方法开始了，参数是：" + a + "," + b);
        int r = a / b;
        System.out.println("div方法结束了，结果是：" + r);
        return r;
    }
}
