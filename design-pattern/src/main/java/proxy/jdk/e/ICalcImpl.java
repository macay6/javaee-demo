package proxy.jdk.e;

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
