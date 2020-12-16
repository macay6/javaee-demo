package enumDemo;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName: WeekEnumTest
 * @Description:
 * @Author: Macay
 * @Date: 2020/12/16 12:41 上午
 */
public class WeekEnumTest {
    /**
     * 测试成员方法的get/set方法
     */
    @Test
    public void testGet() {
        WeekEnum.SUNDAY.setIndex(7);
        WeekEnum.SUNDAY.setDate("星期日");
        // 可以用来获取枚举对象的属性
        System.out.println(WeekEnum.SUNDAY.getIndex());
        System.out.println(WeekEnum.SUNDAY.getDate());
    }

    /**
     * 枚举对象可以调用普通方法
     */
    @Test
    public void testShow() {
        WeekEnum.MONDay.show();
    }

    /**
     * 测试toString方法
     */
    @Test
    public void testToString() {
        WeekEnum.SUNDAY.setIndex(7);
        WeekEnum.SUNDAY.setDate("星期日");
        System.out.println(WeekEnum.SUNDAY.toString());
    }

    /**
     * 构造方法，不重写toString的情况下， WeekEnum.MONDay=MONDay
     */
    @Test
    public void testConsturctor() {
        // 有参
        System.out.println(WeekEnum.MONDay);
        // 无参
        System.out.println(WeekEnum.SUNDAY);
    }

    /**
     * 枚举值之间的比较使用==，！=
     */
    @Test
    public void testEq() {
        System.out.println(WeekEnum.MONDay == WeekEnum.MONDay);
        System.out.println(WeekEnum.MONDay != WeekEnum.SATURDAY);
    }

    /**
     * 枚举对象的方法
     */
    @Test
    public void testMethod() {
        WeekEnum monday = WeekEnum.MONDay;
        // name()
        String name = WeekEnum.MONDay.name();
        // ordinal(),返回枚举值在枚举类中的索引值(从0开始)，即枚举值在枚举声明中的顺序
        int ordinal = WeekEnum.MONDay.ordinal();
        // toString()
        String string = WeekEnum.MONDay.toString();
        System.out.println(monday);
        System.out.println(name);
        System.out.println(ordinal);
        System.out.println(string);
    }

    /**
     * 枚举类的静态方法
     */
    @Test
    public void testStatic() {
        // values()方法得到一个枚举值的数组，枚举值与toString对应
        WeekEnum[] values = WeekEnum.values();
        String string = Arrays.toString(values);
        System.out.println(string);
        // valueOf(String name),返回带指定名称的指定枚举类型的枚举常量，名称必须与在此类型中声明枚举常量所用的标识符完全匹配
        WeekEnum monDay = WeekEnum.valueOf("MONDay");
        System.out.println(monDay);

    }
}
