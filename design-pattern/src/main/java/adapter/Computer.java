package adapter;

/**
 * @ClassName: Computer
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/28 11:14 上午
 */
// 业务类
public class Computer {
    //充电
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        }else if(iVoltage5V.output5V() > 5){
            System.out.println("电压大于5V,不能充电");
        }
    }
}
