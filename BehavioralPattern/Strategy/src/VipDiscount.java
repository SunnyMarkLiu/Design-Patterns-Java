/**
 * Author: markliu
 * Time  : 16-9-3 下午3:21
 */
public class VipDiscount implements Discount {

	@Override
	public double calculate(double price) {
		System.out.println("VIP：");
		System.out.println("增加积分");
		return price * 0.5;
	}
}
