package lambda;

import lambda.inferface.NoReturenNoParamter;
import lambda.inferface.NoneReturnMutipleParamter;
import lambda.inferface.SingleRetuenMutipleParmter;
import lambda.inferface.SingleReturnSingleParamter;

/**
 * @ClassName: Test
 * @Description:
 * @Author: Macay
 * @Date: 2021/2/23 9:03 下午
 */
public class Test {
    public static void main(String[] args) {
        // 无参无返回
        NoReturenNoParamter lambda1 = () -> {
            System.out.println("lambda1");
        };
        lambda1.test();

        // 两个参数有返回
        SingleRetuenMutipleParmter lambda2 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(lambda2.test(3, 5));

        //单参数有返回值,参数类型可省略
        SingleReturnSingleParamter lambda3 = (a) -> {
            return a * a;
        };

        // 参数的个数有且仅有一个，则小括号也可以省略
        SingleReturnSingleParamter lambda31 = a -> {
            return a * a;
        };

        // 如果方法体总唯一的语句是一个返回语句，则大括号在省略掉的同时，returen也必须省略。
        SingleReturnSingleParamter lambda32 = a -> a * a;

        System.out.println(lambda3.test(5));

        // 两个参数无返回，参数类型可省略
        NoneReturnMutipleParamter lambda4 = (a, b) -> {
            System.out.println(a + b);
        };
        lambda4.test(3, 5);

        // 如果方法体内只有一句代码，则大括号也可以省略。
        NoneReturnMutipleParamter lambda41 = (a, b) -> System.out.println(a + b);

        lambda4.test(3, 5);
    }
}
