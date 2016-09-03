/**
 * Author: markliu
 * Time  : 16-9-3 下午3:20
 */
public class MovieTicket {

	private double price;
	private Discount discount;

	public MovieTicket(double price) {
		this.price = price;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public double getDiscountPrice() {
			return discount != null ? discount.calculate(price) : price;
	}
}
