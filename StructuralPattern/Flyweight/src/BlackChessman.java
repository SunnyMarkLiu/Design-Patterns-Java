/**
 * 具体享元类
 * 它实现了抽象享元类，其实例称为享元对象；在具体享元类中为内部状态提供了存储空间(成员变量)。
 * 通常我们可以结合单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象。
 * Author: markliu
 * Time  : 16-9-2 上午11:23
 */
public class BlackChessman extends IgoChessman {

	public BlackChessman() {
		this.color = "black";
	}

	@Override
	String getColor() {
		return this.color;
	}
}
