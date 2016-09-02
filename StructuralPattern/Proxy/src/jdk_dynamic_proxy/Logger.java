package jdk_dynamic_proxy;

/**
 * Author: markliu
 * Time  : 16-9-2 下午4:31
 */
public class Logger {

	public void log(String userId) {
		System.out.println("Logger ==> user (" + userId + ") logged");
	}
}
