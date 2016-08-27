/**
 * Author: markliu
 * Time  : 16-8-27 下午10:48
 */
public class FileLoggerFactory implements LoggerFactory {
	@Override
	public Logger getLogger() {
		// 创建文件日志记录器
		Logger logger = new FileLogger();
		// 其他业务逻辑
		return logger;
	}
}
