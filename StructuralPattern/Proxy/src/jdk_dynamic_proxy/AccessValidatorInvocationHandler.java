package jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author: markliu
 * Time  : 16-9-2 下午9:20
 */
public class AccessValidatorInvocationHandler implements InvocationHandler {

	private AccessValidator accessValidator;
	private Object target;

	public AccessValidatorInvocationHandler(Object target) {
		this.target = target;
		accessValidator = new AccessValidator();
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (accessValidator.validate((String)args[0])) {
			System.out.println(args[0] + "用户验证成功！");
			Object result = method.invoke(target, args);
			System.out.println("Validator返回...");
			return result;
		}
		return null;
	}

	public static Object createProxy(Object target) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new AccessValidatorInvocationHandler(target));
	}
}
