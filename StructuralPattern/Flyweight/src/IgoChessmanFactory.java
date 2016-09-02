import java.util.Hashtable;

/**
 * Author: markliu
 * Time  : 16-9-2 上午11:22
 */
public class IgoChessmanFactory {

	private final static IgoChessmanFactory igoChessmanFactory = new IgoChessmanFactory();

	private Hashtable<String, IgoChessman> igoChessmanContext;

	private IgoChessmanFactory(){
		igoChessmanContext = new Hashtable<>();
		igoChessmanContext.put("white", new WhiteIgoChessman());
		igoChessmanContext.put("black", new BlackChessman());
	}

	public static IgoChessmanFactory getIgoChessmanFactory() {
		return igoChessmanFactory;
	}


	public IgoChessman getIgoChessman(String colorKey) {
		if (igoChessmanContext.containsKey(colorKey)) {
			return igoChessmanContext.get(colorKey);
		} else {
			// 向 igoChessmanContext 中添加新的数据, 并返回
			return null;
		}
	}
}
