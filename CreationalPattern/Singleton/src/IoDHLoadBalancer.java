import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 使用 IoDH （Initialization on Demand Holder）机制实现的单例模式
 *
 * 饿汉模式不能实现延迟加载，系统启动后就常驻内存;
 * 懒汉模式线程安全控制繁琐，且性能收影响。
 * Author: markliu
 * Time  : 16-8-27 下午7:38
 */
public class IoDHLoadBalancer {

	/**
	 * 服务器集群
	 */
	private List<String> servers;

	/**
	 * 私有化构造函数
	 */
	private IoDHLoadBalancer() {
		// 模拟负载均衡初始化需要花费一定的时间
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		servers = new ArrayList<>();
	}

	/**
	 * 静态内部类，只有引用 IoDHLoadBalancerHolder 类时，JVM才加载该类并创建 IoDHLoadBalancer 实例。
	 * JVM 类加载机制保证线程安全，loadBalancer 只会创建一次
	 */
	private static class IoDHLoadBalancerHolder {
		private final static IoDHLoadBalancer loadBalancer = new IoDHLoadBalancer();
	}

	/**
	 * 外部获取实例的唯一接口
	 */
	public static IoDHLoadBalancer getLoadBalancerInstance() {
		return IoDHLoadBalancerHolder.loadBalancer;
	}

	/**
	 * 增加服务器
	 */
	public void addServer(String server) {
		if (server != null)
			servers.add(server);
	}

	/**
	 * 删除服务器
	 */
	public void removeServer(String server) {
		if (server != null && servers.contains(server))
			servers.remove(server);
	}

	/**
	 * 随机获取服务器
	 */
	public String getRandomServer() {
		int index = new Random().nextInt(servers.size());
		return servers.get(index);
	}
}
