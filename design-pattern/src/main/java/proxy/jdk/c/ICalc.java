package proxy.jdk.c;

/**
 * @ClassName: Icalc
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/17 1:40 下午
 */
// 计算器接口
public interface ICalc {
    // 加
    int add(int a, int b);
    // 减
    int sub(int a, int b);
    // 乘
    int mul(int a, int b);
    // 除
    int div(int a, int b);
}
