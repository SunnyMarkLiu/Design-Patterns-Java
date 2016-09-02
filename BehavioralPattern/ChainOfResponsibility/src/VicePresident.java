/**
 * Author: markliu
 * Time  : 16-9-2 下午10:29
 */
public class VicePresident extends Approver {

	public VicePresident(String name) {
		super(name);
	}

	@Override
	protected void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 100000) {
			System.out.println("VicePresident processRequest:" + request.getAmount());
			return;
		}
		this.successor.processRequest(request);
	}
}