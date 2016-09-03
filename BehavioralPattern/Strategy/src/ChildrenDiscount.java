/**
 * Author: markliu
 * Time  : 16-9-3 下午3:21
 */
public class ChildrenDiscount implements Discount {

	@Override
	public double calculate(double price) {
		System.out.println("儿童票：");
		if (price > 20)
			return price - 10;
		return price;
	}
}
