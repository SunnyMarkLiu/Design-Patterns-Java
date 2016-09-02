package jdk_dynamic_proxy;

/**
 * Author: markliu
 * Time  : 16-9-2 下午4:38
 */
public class ClientTest {

	public static void main(String[] args) {
		Searcher targetSearcher = new RealSearcher();
		Searcher proxySearcher = (Searcher) LoggerInvocationHandler.createProxy(
				AccessValidatorInvocationHandler.createProxy(targetSearcher)
		);

		proxySearcher.doSearch("test", "design pattern");
	}
}
