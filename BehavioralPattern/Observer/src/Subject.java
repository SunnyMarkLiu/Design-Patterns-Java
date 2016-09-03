import java.util.ArrayList;
import java.util.List;

/**
 * 目标，目标又称为主题
 * 它是指被观察的对象。在目标中定义了一个观察者集合，一个观察目标可以接受任意数量的观察者来观察，
 * 它提供一系列方法来增加和删除观察者对象，同时它定义了通知方法 notify()。目标类可以是接口，也
 * 可以是抽象类或具体类。
 *
 * Author: markliu
 * Time  : 16-9-3 上午10:55
 */
public abstract class Subject {

	protected List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	abstract void notifyAllObserver();
}
