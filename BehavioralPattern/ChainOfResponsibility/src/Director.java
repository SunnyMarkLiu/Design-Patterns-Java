/**
 * Author: markliu
 * Time  : 16-9-2 下午10:24
 */
public class Director extends Approver {

	public Director(String name) {
		super(name);
	}

	@Override
	protected void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 50000) {
			System.out.println("Director processRequest:" + request.getAmount());
			return;
		}
		this.successor.processRequest(request);
	}
}
