package state;

/**
 * @ClassName: 空闲状态：可预定，可入住
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/5 1:44 下午
 */
public class FreeTimeState extends State{

    /**
     * 预定
     */
    @Override
    public void bookRoom() {
        super.room.setState(Room.bookedState); // 状态变成已经预订
        System.out.println("预定成功");
    }

    /**
     * 退订
     */
    @Override
    public void unsubscribeRoom() {

    }

    /**
     * 入住
     */
    @Override
    public void checkInRoom() {
        super.room.setState(Room.checkInState);  //状态变成已经入住
        System.out.println("入住成功");
    }

    /**
     * 退房
     */
    @Override
    public void checkOutRoom() {

    }
}
