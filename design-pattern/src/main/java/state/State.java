package state;

/**
 * @ClassName: State
 * @Description:
 * @Author: Macay
 * @Date: 2022/10/5 11:32 上午
 */
public abstract class State {

    protected Room room;

    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * @desc 预订房间
     */
    public abstract void bookRoom();

    /**
     * @desc 退订房间
     */
    public abstract void unsubscribeRoom();

    /**
     * @desc 入住
     */
    public abstract void checkInRoom();

    /**
     * @desc 退房
     */
    public abstract void checkOutRoom();
}
