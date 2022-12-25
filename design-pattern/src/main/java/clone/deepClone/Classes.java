package clone.deepClone;

import java.io.Serializable;

/**
 * @ClassName: Classes
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/6 3:51 下午
 */
public class Classes implements Serializable {

    /**
     * 班级名称
     */
    private String name;

    /**
     * 班级口号
     */
    private String slogan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
