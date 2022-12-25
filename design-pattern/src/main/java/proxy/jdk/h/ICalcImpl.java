package proxy.jdk.h;

/**
 * @ClassName: ICalcImpl
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 1:44 下午
 */
public class ICalcImpl implements ICalc {
    @Override
    public int add(int a, int b) {
        int r = a + b;
        System.out.println("ICalcImpl add 执行了");
        return r;
    }

    @Override
    public int sub(int a, int b) {
        int r = a - b;
        return r;
    }

    @Override
    public int mul(int a, int b) {
        int r = a * b;
        return r;
    }

    @Override
    public int div(int a, int b) {
        int r = a / b;
        return r;
    }
}
