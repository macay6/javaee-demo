package flyweight;

/**
 * @ClassName: ConcreteFlyweight
 * @Description:
 * @Author: Macay
 * @Date: 2022/8/25 9:18 下午
 */
public class ConcreteFlyweight implements IFlyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }


    @Override
    public void operation(String extrinsicState) {
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}
