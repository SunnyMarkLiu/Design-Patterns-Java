/**
 * 观察者
 * 观察者将对观察目标的改变做出反应，观察者一般定义为接口，该接口声明了更新数据的方法update()，因此又称为抽象观察者。
 *
 * Author: markliu
 * Time  : 16-9-3 上午11:18
 */
public interface Observer {

	void update();
}
