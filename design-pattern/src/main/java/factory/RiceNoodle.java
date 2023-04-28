package factory;

/**
 * @ClassName: RiceNoodle
 * @Description:
 * @Author: Macay
 * @Date: 2022/7/23 11:43 上午
 */
public class RiceNoodle implements Food {

    @Override
    public void eat() {
        System.out.println("吃米线");
    }
}
