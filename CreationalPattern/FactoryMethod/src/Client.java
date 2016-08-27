/**
 * Author: markliu
 * Time  : 16-8-27 下午10:49
 */
public class Client {

	public static void main(String[] args) {

		// 创建具体的工厂可通过配置文件读取
		LoggerFactory loggerFactory = new FileLoggerFactory();
		Logger logger = loggerFactory.getLogger();
		logger.writeLog();

		loggerFactory = new DatabaseLoggerFactory();
		logger = loggerFactory.getLogger();
		logger.writeLog();
	}
}
