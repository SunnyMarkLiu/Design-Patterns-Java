import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 负载均衡器，实际应用环境包含大量的初始化工作和业务方法。
 *
 * 注意： 基本的单例模式存在如下错误：
 *  当第一次调用getLoadBalancer()方法创建并启动负载均衡器时，instance对象为null值，
 *  因此系统将执行代码instance= new LoadBalancer()，在此过程中，由于要对LoadBalancer
 *  进行大量初始化工作，需要一段时间来创建LoadBalancer对象。而在此时，如果再一次调用
 *  getLoadBalancer()方法（通常发生在多线程环境中），由于instance尚未创建成功，
 *  仍为null值，判断条件(instance== null)为真值，因此代码instance= new LoadBalancer()
 *  将再次执行，导致最终创建了多个instance对象，这违背了单例模式的初衷，也导致系统运行发生错误。
 *
 * Author: markliu
 * Time  : 16-8-27 下午6:35
 */
public class BasicLoadBalancer {

	/**
	 * 私有静态成员变量，保存唯一实例
	 */
	private static BasicLoadBalancer basicLoadBalancer = null;

	/**
	 * 服务器集群
	 */
	private List<String> servers;

	/**
	 * 私有化构造函数
	 */
	private BasicLoadBalancer(){
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
	public static BasicLoadBalancer getLoadBalancerInstance() {
		if (basicLoadBalancer == null) {
			basicLoadBalancer = new BasicLoadBalancer();
		}
		return basicLoadBalancer;
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
