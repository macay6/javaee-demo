package observer.f;

/**
 * @ClassName: Subject
 * @Description:
 * @Author: Macay
 * @Date: 2022/9/22 10:01 下午
 */
// 抽象主题
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Object obj);

    void notifyObservers();
}
