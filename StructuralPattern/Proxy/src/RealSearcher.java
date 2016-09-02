/**
 * Author: markliu
 * Time  : 16-9-2 下午4:26
 */
public class RealSearcher implements Searcher {

	@Override
	public String doSearch(String userId, String keywords) {

		System.out.println("RealSearcher ==> user (" + userId + ") search : " + keywords);
		return "search result";
	}
}
