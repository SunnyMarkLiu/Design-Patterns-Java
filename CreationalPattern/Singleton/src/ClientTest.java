/**
 * 注意此种
 * Author: markliu
 * Time  : 16-8-27 下午6:47
 */
public class ClientTest {

	public static void main(String args[]) {
		testBasicSingleton();
	}

	public static void testBasicSingleton() {
		BasicLoadBalancer loadBalancer1, loadBalancer2;
		loadBalancer1 = BasicLoadBalancer.getLoadBalancerInstance();
		loadBalancer2 = BasicLoadBalancer.getLoadBalancerInstance();

		// 判断 BasicLoadBalancer 实例是否为同一个对象
		System.out.println("basicLoadBalancer1 和 basicLoadBalancer2 是否为同一实例：" +
				(loadBalancer1 == loadBalancer2));

		// 增加服务器
		loadBalancer1.addServer("server 1");
		loadBalancer1.addServer("server 2");
		loadBalancer1.addServer("server 3");
		loadBalancer1.addServer("server 4");
		loadBalancer1.addServer("server 5");
		loadBalancer1.addServer("server 6");

		// 模拟客户端分发请求
		for (int i = 0; i < 10; i++) {
			String server = loadBalancer1.getRandomServer();
			System.out.println("分发请求至：" + server);
		}
	}
}
