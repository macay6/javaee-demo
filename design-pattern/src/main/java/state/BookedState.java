package state;

/**
 * @ClassName: 已预定状态
 * @Description: 可退订
 * @Author: Macay
 * @Date: 2022/10/5 2:24 下午
 */
public class BookedState extends State {
    @Override
    public void bookRoom() {

    }

    @Override
    public void unsubscribeRoom() {
       super.room.setState(Room.freeTimeState);  //变成空闲状态
        System.out.println("退定成功");
    }

    @Override
    public void checkInRoom() {
       super.room.setState(Room.checkInState); //状态变成入住
        System.out.println("入住成功");
    }

    @Override
    public void checkOutRoom() {

    }
}
