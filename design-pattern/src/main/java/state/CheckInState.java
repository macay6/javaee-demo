package state;

/**
 * @ClassName: 入住状态
 * @Description: 可退房
 * @Author: Macay
 * @Date: 2022/10/5 2:27 下午
 */
public class CheckInState extends State{
    @Override
    public void bookRoom() {

    }

    @Override
    public void unsubscribeRoom() {

    }

    @Override
    public void checkInRoom() {

    }

    @Override
    public void checkOutRoom() {
        super.room.setState(Room.freeTimeState); //状态变成空闲
        System.out.println("退房成功");
    }
}
