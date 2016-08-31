/**
 * 抽象构件
 * 它是具体构件和抽象装饰类的共同父类/接口，声明了在具体构件中实现的业务方法，它的引入可以
 * 使客户端以一致的方式处理未被装饰的对象以及装饰之后的对象，实现客户端的透明操作。
 *
 * Author: markliu
 * Time  : 16-8-31 下午8:17
 */
public interface Component {

	void display();

}
