import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 饿汉模式的负载均衡器，实际应用环境包含大量的初始化工作和业务方法。
 *
 * 饿汉模式不能实现延迟加载，系统启动后就常驻内存。
 * Author: markliu
 * Time  : 16-8-27 下午6:35
 */
public class EagerLoadBalancer {

	/**
	 * 私有静态成员变量，保存唯一实例。
	 * JVM加载该类文件时即创建该对象
	 */
	private final static EagerLoadBalancer loadBalancer = new EagerLoadBalancer();

	/**
	 * 服务器集群
	 */
	private List<String> servers;

	/**
	 * 私有化构造函数
	 */
	private EagerLoadBalancer(){
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
	public static EagerLoadBalancer getLoadBalancerInstance() {
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
