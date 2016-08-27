import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 懒汉模式的负载均衡器，结合<b>双重检查锁定机制(Double-Check Locking)</b>。
 *
 * 懒汉模式线程安全控制繁琐，且性能收影响。
 * Author: markliu
 * Time  : 16-8-27 下午6:35
 */
public class LazyDoubleCheckLoadBalancer {

	/**
	 * 私有静态成员变量，保存唯一实例。
	 * 使用双重检查锁定机制时，需要在静态成员变量之前加上 volatile 修饰符
	 */
	private volatile static LazyDoubleCheckLoadBalancer loadBalancer = null;

	/**
	 * 服务器集群
	 */
	private List<String> servers;

	/**
	 * 私有化构造函数
	 */
	private LazyDoubleCheckLoadBalancer(){
		// 模拟负载均衡初始化需要花费一定的时间
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		servers = new ArrayList<>();
	}

	/**
	 * 外部获取实例的唯一接口
	 */
	public static LazyDoubleCheckLoadBalancer getLoadBalancerInstance() {
		// 第一重检查
		if (loadBalancer == null) {
			// 锁定代码快
			synchronized (LazyDoubleCheckLoadBalancer.class) {
				// 第二重检查
				if (loadBalancer == null) {
					loadBalancer = new LazyDoubleCheckLoadBalancer();
				}
			}
		}
		return loadBalancer;
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
