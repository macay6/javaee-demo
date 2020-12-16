package enumDemo;

import org.junit.Test;

/**
 * @ClassName: ColorEnumTest
 * @Description:
 * @Author: Macay
 * @Date: 2020/12/16 12:22 上午
 */
public class ColorEnumTest {
    @Test
    public void test() {
        System.out.println(ColorEnum.RED); // RED,可以直接获取对应的常量值
    }

    @Test
    public void testSwitch() {
        toSwitch(ColorEnum.RED);
    }

    /**
     * 枚举配合switch使用
     * @param colorEnum
     */
    public void toSwitch(ColorEnum colorEnum) {
        switch (colorEnum) {
            case RED:
                System.out.println("这是红色");
                break;
            case GREEN:
                System.out.println("今这是绿色");
                break;
            case BLUE:
                System.out.println("这是蓝色");
                break;
            default:
                System.out.println("无色");
                break;
        }
    }
}
