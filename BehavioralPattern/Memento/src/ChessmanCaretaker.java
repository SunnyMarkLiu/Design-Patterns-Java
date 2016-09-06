/**
 * 负责人：负责人又称为管理者，它负责保存备忘录，但是不能对备忘录的内容进行操作或检查。在负责人
 * 类中可以存储一个或多个备忘录对象，它只负责存储对象，而不能修改对象，也无须知道对象的实现细节。
 *
 * Author: markliu
 * Time  : 16-9-6 上午10:52
 */
public class ChessmanCaretaker {

	// 只保存备忘录类的一个状态，如果需要实现多步撤销，可使用集合保存
	private ChessmanMemento chessmanMemento;

	public ChessmanMemento getChessmanMemento() {
		return chessmanMemento;
	}

	public void setChessmanMemento(ChessmanMemento chessmanMemento) {
		this.chessmanMemento = chessmanMemento;
	}
}
