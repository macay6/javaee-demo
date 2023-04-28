package state;

/**
 * @ClassName: AppTest
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/5 2:32 下午
 */
public class AppTest {

    public static void main(String[] args) {
        Room room = new Room();
        room.setState(new FreeTimeState());
        room.bookRoom();
        room.unsubscribeRoom();
        room.checkInRoom();
        room.checkOutRoom();
    }
}
