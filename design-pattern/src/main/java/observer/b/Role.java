package observer.b;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Role
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 5:05 下午
 */
public class Role {

    private Integer hp;

    private Integer mp;

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Object obj) {
        observers.remove(obj);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(hp);
        }
    }



    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }
}
