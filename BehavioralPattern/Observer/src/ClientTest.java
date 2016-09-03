/**
 * Author: markliu
 * Time  : 16-9-3 上午11:31
 */
public class ClientTest {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver("observer1");
		Observer observer2 = new ConcreteObserver("observer2");
		Observer observer3 = new ConcreteObserver("observer3");
		Observer observer4 = new ConcreteObserver("observer4");

		// 注册观察者
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.addObserver(observer3);
		subject.addObserver(observer4);

		// 目标状态发生变化，通知符合要求的注册的观察者
		subject.notifyAllObserver();
	}
}
