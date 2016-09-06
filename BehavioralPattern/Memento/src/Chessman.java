/**
 * 原发器：它是一个普通类，可以创建一个备忘录，并存储它的当前内部状态，也可以使用备忘录来恢复其内部状态，
 * 一般将需要保存内部状态的类设计为原发器。
 *
 * Author: markliu
 * Time  : 16-9-6 上午10:45
 */
public class Chessman {

	private String label;
	private int x;
	private int y;

	public Chessman(String label, int x, int y) {
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

	public void display() {
		System.out.println(this.label + " : " + this.x + "-" + this.y);
	}

	/**
	 * 保存状态到备忘录类中
	 */
	public ChessmanMemento saveChessmanMemento() {
		return new ChessmanMemento(this.label, this.x, this.y);
	}

	/**
	 * 恢复状态
	 */
	public void restoreChessmanMemento(ChessmanMemento chessmanMemento) {
		this.label = chessmanMemento.getLabel();
		this.x = chessmanMemento.getX();
		this.y = chessmanMemento.getY();
	}
}
