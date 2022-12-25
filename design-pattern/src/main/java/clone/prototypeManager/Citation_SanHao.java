package clone.prototypeManager;

import clone.deepClone.Classes;

import java.io.Serializable;

/**
 * @ClassName: Citation_SanHao
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/6 9:21 下午
 */
public class Citation_SanHao extends AbstractDeepClone implements Serializable {

    private String name;
    private String content;
    private String school;
    private Classes classes;

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

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public void display() {
        System.out.println(classes.getName() + name + "同学");
        System.out.println(content);
        System.out.println(school);
    }
}
