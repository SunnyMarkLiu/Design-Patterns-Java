/**
 * Author: markliu
 * Time  : 16-9-2 下午10:31
 */
public class ClientTest {

	public static void main(String[] args) {
		PurchaseRequest request = new PurchaseRequest(900000);

		Approver director = new Director("Director");
		Approver vicePresident = new VicePresident("VicePresident");
		Approver president = new President("President");
		Approver congress = new Congress("Congress");

		// 设置处理的责任链
		director.setSuccessor(vicePresident);
		vicePresident.setSuccessor(president);
		president.setSuccessor(congress);

		director.processRequest(request);
	}
}
