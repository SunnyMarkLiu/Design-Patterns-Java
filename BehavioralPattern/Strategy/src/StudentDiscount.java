/**
 * Author: markliu
 * Time  : 16-9-3 下午3:21
 */
public class StudentDiscount implements Discount {

	@Override
	public double calculate(double price) {
		System.out.println("学生票：");
		return price * 0.8;
	}
}
