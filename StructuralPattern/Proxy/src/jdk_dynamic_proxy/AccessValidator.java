package jdk_dynamic_proxy;

/**
 * Author: markliu
 * Time  : 16-9-2 下午4:32
 */
public class AccessValidator {

	public boolean validate(String userId) {
		System.out.println("AccessValidator ==> validate user (" + userId + ")");
		if ("test".equalsIgnoreCase(userId)) {
			System.out.println("AccessValidator ==> user (" + userId + ") validated success");
			return true;
		} else {
			System.out.println("AccessValidator ==> user (" + userId + ") validated fail");
			return false;
		}
	}
}
