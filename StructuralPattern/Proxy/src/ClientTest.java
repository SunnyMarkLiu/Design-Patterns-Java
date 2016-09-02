/**
 * Author: markliu
 * Time  : 16-9-2 下午4:38
 */
public class ClientTest {

	public static void main(String[] args) {
		Searcher searcher = new ProxySearcher();
		String result = searcher.doSearch("test", "design pattern");
		System.out.println(result);
	}
}
