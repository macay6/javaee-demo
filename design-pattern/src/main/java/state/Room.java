package state;

/**
 * @ClassName: Context
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/5 11:42 上午
 */
// 环境类
public class Room {

    //定义状态
    public final static State freeTimeState = new FreeTimeState();
    public final static State bookedState = new BookedState();
    public final static State checkInState = new CheckInState();

    // 当前状态
    private State state;

    // 获取当前状态
    public State getState() {
        return state;
    }

    // 设置当前状态
    public void setState(State state) {
        this.state = state;
        // 切换状态
        this.state.setRoom(this);
    }


    public void bookRoom() {
        this.state.bookRoom();
    }


    public void unsubscribeRoom() {
        this.state.unsubscribeRoom();
    }


    public void checkInRoom() {
        this.state.checkInRoom();
    }

    public void checkOutRoom() {
        this.state.checkOutRoom();
    }
}
