package TimeUnit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ConvertDemo
 * @Description:
 * @Author: Macay
 * @Date: 2021/2/24 11:33 下午
 */
public class ConvertDemo {
    public static void main(String[] args) {
        long time = TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS);
        System.out.println("1小时转为毫秒："+time);

        //三天后的日期
        long time2 = TimeUnit.MILLISECONDS.convert(3, TimeUnit.DAYS);
        System.out.println("3天转为毫秒：" + time2);
        long threeTime = System.currentTimeMillis() + time2; //当前时间的毫秒数+3天后的毫秒数
        System.out.println("3天后的日期：" + new Date(threeTime));
        System.out.println("3天后的日期：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(threeTime)));
    }
}
