/**
 * 备忘录：存储原发器的内部状态，根据原发器来决定保存哪些内部状态。备忘录的设计一般可以参考原发器的设计，
 * 根据实际需要确定备忘录类中的属性。需要注意的是，除了原发器本身与负责人类之外，备忘录对象不能直接供其他
 * 类使用，原发器的设计在不同的编程语言中实现机制会有所不同。
 *
 * Author: markliu
 * Time  : 16-9-6 上午10:47
 */
public class ChessmanMemento {

	private String label;
	private int x;
	private int y;

	public ChessmanMemento(String label, int x, int y) {
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
