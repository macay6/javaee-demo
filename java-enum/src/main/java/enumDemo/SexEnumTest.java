package enumDemo;

import org.junit.Test;

/**
 * @ClassName: SexEnumTest
 * @Description:
 * @Author: Macay
 * @Date: 2020/12/16 12:51 下午
 */
public class SexEnumTest {
    @Test
    public void test() {
        // 通过枚举对象的get方法获取常量值
        String value = SexEnum.FAMALE.getValue();
        System.out.println(value);
    }
}
