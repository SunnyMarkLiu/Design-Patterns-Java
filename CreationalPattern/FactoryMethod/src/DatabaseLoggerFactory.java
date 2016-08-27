/**
 * Author: markliu
 * Time  : 16-8-27 下午10:47
 */
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger getLogger() {
		// 创建数据库方式日志记录器
		Logger logger = new DatabaseLogger();
		// 其他业务逻辑

		return logger;
	}
}
