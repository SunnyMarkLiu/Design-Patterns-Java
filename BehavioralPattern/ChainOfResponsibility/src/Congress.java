/**
 * Author: markliu
 * Time  : 16-9-2 下午10:27
 */
public class Congress extends Approver {

	public Congress(String name) {
		super(name);
	}

	@Override
	protected void processRequest(PurchaseRequest request) {
		System.out.println("50万元及以上的采购单就需要开董事会讨论决定");
	}
}
