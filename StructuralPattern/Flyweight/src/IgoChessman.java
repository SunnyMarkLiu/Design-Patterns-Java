/**
 * 抽象享元类
 * 通常是一个接口或抽象类，在抽象享元类中声明了具体享元类公共的方法，这些方法可以向外界提供享元对象的内部数据（内部状态），
 * 同时也可以通过这些方法来设置外部数据（外部状态）。
 *
 * Author: markliu
 * Time  : 16-9-2 上午11:23
 */
public abstract class IgoChessman {

	/**
	 * 内部状态
	 */
	protected String color;

	abstract String getColor();

	/**
	 *
	 * @param coord 外部状态通过参数注入
	 */
	public void display(Coordinates coord) {
		System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY());
	}
}
