/**
 * Author: markliu
 * Time  : 16-9-2 下午10:29
 */
public class President extends Approver {

	public President(String name) {
		super(name);
	}

	@Override
	protected void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 500000) {
			System.out.println("President processRequest:" + request.getAmount());
			return;
		}
		this.successor.processRequest(request);
	}
}