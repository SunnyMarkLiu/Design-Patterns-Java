package jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * Author: markliu
 * Time  : 16-9-2 下午9:18
 */
public class LoggerInvocationHandler implements InvocationHandler {

	private Object target;
	private Logger logger;

	public LoggerInvocationHandler(Object target) {
		this.target = target;
		logger = new Logger();
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		logger.log((String) args[0]);
		System.out.println("开始日志记录:" + new Date() + " " + args[0] + " 查询数据");
		Object result = method.invoke(target, args);
		System.out.println("日志记录: 查询成功，结果为： " + result);
		System.out.println("Logger返回...");
		return result;
	}

	public static Object createProxy(Object target) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new LoggerInvocationHandler(target));
	}
}
