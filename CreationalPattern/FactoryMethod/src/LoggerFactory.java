/**
 * 抽象工厂
 * 在抽象工厂类中，声明了工厂方法(Factory Method)，用于返回一个产品。
 * 抽象工厂是工厂方法模式的核心，所有创建对象的工厂类都必须实现该接口。
 * Author: markliu
 * Time  : 16-8-27 下午10:44
 */
public interface LoggerFactory {

	Logger getLogger();
}
