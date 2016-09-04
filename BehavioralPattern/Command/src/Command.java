/**
 * 抽象命令类
 * 抽象命令类一般是一个抽象类或接口，在其中声明了用于执行请求的 executeResponse()等方法，通过这些方法可以调用请求接收者的相关操作。
 * Author: markliu
 * Time  : 16-9-4 上午11:53
 */
public interface Command {

	/** 执行命令接收者的响应 */
	void execute();
}
