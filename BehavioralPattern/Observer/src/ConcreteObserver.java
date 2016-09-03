/**
 * 具体观察者
 * 在具体观察者中维护一个指向具体目标对象的引用，它存储具体观察者的有关状态，这些状态需要和具体目标的状态保持一致；
 * 它实现了在抽象观察者Observer中定义的update()方法。通常在实现时，可以调用具体目标类的 attach() 方法将自己
 * 添加到目标类的集合中或通过detach()方法将自己从目标类的集合中删除。
 *
 * Author: markliu
 * Time  : 16-9-3 上午11:24
 */
public class ConcreteObserver implements Observer {

	// 具体观察者中维护一个指向具体目标对象的引用
	private Subject observerTarget;
	private String name = null;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	public void update() {
		System.out.println(this.name + " updated!");
	}
}
