/**
 * Author: markliu
 * Time  : 16-9-2 下午4:29
 */
public class ProxySearcher implements Searcher {

	private Searcher realSearcher;
	private AccessValidator validator;
	private Logger logger;

	public ProxySearcher() {
		realSearcher = new RealSearcher();
		validator = new AccessValidator();
		logger = new Logger();
	}

	@Override
	public String doSearch(String userId, String keywords) {

		if (validator.validate(userId)) {
			logger.log(userId);
			return realSearcher.doSearch(userId, keywords);
		} else {
			return null;
		}
	}
}
