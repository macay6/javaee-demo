package clone.deepClone;

import java.io.*;

/**
 * @ClassName: Citation
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/6 3:26 下午
 */
// 奖状类，实现cloneable接口
public class Citation implements Cloneable, Serializable {

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

    public void show () {
        System.out.println(classes.getName() + name + "同学");
        System.out.println(content);
        System.out.println(school);
    }

    // 重写clone方法
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            // 序列化
            // 如果写死一个路径，可能会导致跨平台使用时，文件路径找不到，我们这里将文件直接写在内存中
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);
            // 序列化时，对象的所有属性层级关系会被序列号化自动处理
            oos.writeObject(this);

            // 反序列化，从内存中取出数据
            byte[] bytes = out.toByteArray();
            ByteArrayInputStream in = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(in);
            clone = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭流
        }
        return clone;
    }
}
