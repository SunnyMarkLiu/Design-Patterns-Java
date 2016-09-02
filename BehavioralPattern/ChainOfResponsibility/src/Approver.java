/**
 * Author: markliu
 * Time  : 16-9-2 下午10:19
 */
public abstract class Approver {

	// successor 表示后继处理者
	protected Approver successor;
	protected String name;

	public Approver(String name) {
		this.name = name;
	}

	/**
	 * 设置后置处理器
	 */
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	/**
	 * 抽象请求处理方法
	 */
	protected abstract void processRequest(PurchaseRequest request) ;
}
