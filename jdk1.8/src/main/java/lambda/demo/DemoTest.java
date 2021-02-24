package lambda.demo;

/**
 * @ClassName: DemoTest
 * @Description:
 * @Author: Macay
 * @Date: 2021/2/21 7:55 下午
 */
public class DemoTest {
    public static void main(String[] args) {
//        //=============================原始版==========================
//        // 接口是可以直接new的
//        Demo demo = new Demo() {
//            @Override
//            public void hello() {
//                System.out.println("hello");
//            }
//        };
//        demo.hello();
        //=============================使用lambda==========================
        Demo demo1 = ()-> {System.out.println("hello lambda");};
        demo1.hello();
        demo1.sayHello();
        System.out.println(Demo.add(3,5));
    }
}
