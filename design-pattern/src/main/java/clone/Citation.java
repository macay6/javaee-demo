package clone;

/**
 * @ClassName: Citation
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/6 3:26 下午
 */
// 奖状类，实现cloneable接口
public class Citation implements Cloneable{

    private String name;
    private String content;
    private String school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void show () {
        System.out.println(name + "同学");
        System.out.println(content);
        System.out.println(school);
    }

    // 实现默认的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
