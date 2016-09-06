/**
 * Author: markliu
 * Time  : 16-9-6 上午10:53
 */
public class ClientTest {

	public static void main(String[] args) {

		ChessmanCaretaker chessmanCaretaker = new ChessmanCaretaker();

		Chessman chessman = new Chessman("车", 1, 1);
		chessman.display();
		// 保存状态
		chessmanCaretaker.setChessmanMemento(chessman.saveChessmanMemento());

		// 状态发生改变
		chessman.setX(2);
		chessman.display();

		// 恢复状态
		chessman.restoreChessmanMemento(chessmanCaretaker.getChessmanMemento());
		chessman.display();
	}

}
