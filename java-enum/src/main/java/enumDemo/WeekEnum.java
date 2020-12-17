package enumDemo;

/**
 * @ClassName: WeekEnum
 * @Description: 星期枚举类(多参)
 * @Author: Macay
 * @Date: 2020/12/16 12:18 上午
 */
public enum WeekEnum {
    // 1、定义枚举类型的对象（类似于普通类的new），括号内为构造参数
    //    多个对象之间用"，"分割，用"；"结束
    MONDay(1, "星期一"),
    TUESDAY(2, "星期二"),
    WEDNESDAY(3, "星期三"),
    THURSDAY(4, "星期四"),
    FRIDAY(5, "星期五"),
    SATURDAY(6, "星期六"),
    SUNDAY;

    // 2、定义枚举对象的成员变量（属性）
    // private 修饰的实例变量
    private int index;
    private String date;

    // 3、定义成员方法（get、set 方法）
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // 4、空参构造器，默认是private的
    WeekEnum() {

    }

    // 5、有参构造器，默认是private的
    WeekEnum(int index, String date) {
        this.index = index;
        this.date = date;
    }

    // 6、枚举中也可以定义普通方法
    public void show() {
        System.out.println("hello weekend");
    }

//    // 7、重写父类的方法,也只能重写这个方法，一般不重写
//    @Override
//    public String toString() {
//        return "WeekEnum{" +
//                "index=" + index +
//                ", date='" + date + '\'' +
//                '}';
//    }
    // 通过枚举的属性date获取枚举值
    public static WeekEnum getWeekEnum(String val) {
        for (WeekEnum weekEnum : WeekEnum.values()) {
            if (weekEnum.getDate().equals(val)) {
                return weekEnum;
            }
        }
        return null;
    }
}
