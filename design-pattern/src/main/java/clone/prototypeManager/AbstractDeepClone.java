package clone.prototypeManager;

import java.io.*;

/**
 * @ClassName: IDeepClone
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/6 9:12 下午
 */
public abstract class AbstractDeepClone implements Cloneable {

    @Override
    protected AbstractDeepClone clone() throws CloneNotSupportedException {
        Object clone = null;
        ByteArrayOutputStream out = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream in = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            // 如果写死一个路径，可能会导致跨平台使用时，文件路径找不到，我们这里将文件直接写在内存中
            out = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(out);
            // 序列化时，对象的所有属性层级关系会被序列号化自动处理
            oos.writeObject(this);

            // 反序列化，从内存中取出数据
            byte[] bytes = out.toByteArray();
            in = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(in);
            clone = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                out.close();
                oos.close();
                in.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (AbstractDeepClone)clone;
    }

    public abstract void display();
}
