/**
 * Author: markliu
 * Time  : 16-9-3 下午3:25
 */
public class ClientTest {

	public static void main(String[] args) {
		MovieTicket ticket = new MovieTicket(100);
		// 可通过配置文件动态选择打折的策略
		Discount discount = new ChildrenDiscount();
		ticket.setDiscount(discount);
		double discountPrice = ticket.getDiscountPrice();
		System.out.println("打折之后：" + discountPrice);
	}
}
