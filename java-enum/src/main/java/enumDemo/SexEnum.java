package enumDemo;

/**
 * @ClassName: SexEnum
 * @Description: 性别枚举类（单参数）
 * @Author: Macay
 * @Date: 2020/12/16 12:48 下午
 */
public enum SexEnum {
    // 枚举对象
    MALE("1"),
    FAMALE("0");

    // 属性
    private String value;

    // get
    public String getValue() {
        return value;
    }
    // set
    public void setValue(String value) {
        this.value = value;
    }

    // 构造方法
    SexEnum(String value) {
        this.value = value;
    }
}
