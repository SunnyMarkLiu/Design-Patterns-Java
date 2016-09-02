/**
 * Author: markliu
 * Time  : 16-9-2 上午11:42
 */
public class ClientTest {

	public static void main(String[] args) {
		IgoChessmanFactory igoChessmanFactory = IgoChessmanFactory.getIgoChessmanFactory();
		IgoChessman whiteIgoChessman1 = igoChessmanFactory.getIgoChessman("white");
		IgoChessman whiteIgoChessman2 = igoChessmanFactory.getIgoChessman("white");
		IgoChessman blackIgoChessman = igoChessmanFactory.getIgoChessman("black");

		System.out.println("whiteIgoChessman1 == whiteIgoChessman2 ?" + (whiteIgoChessman1 == whiteIgoChessman2));

		whiteIgoChessman1.display(new Coordinates(1, 2));
	}
}
