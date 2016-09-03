/**
 * Author: markliu
 * Time  : 16-9-3 下午3:59
 */
public abstract class Account {

	public boolean validate(String username, String password) {
		System.out.println("validate user...");
		if ("test".equalsIgnoreCase(username) && "111111".equalsIgnoreCase(password)) {
			return true;
		} else {
			return false;
		}
	}

	public abstract void calculateInterest();

	public void display(double account) {
		System.out.println("display account:" + account);
	}

	public void handlerTemplate(String username, String password, double account) {
		if (!validate(username, password)) {
			System.out.println("validate failed");
		}
		calculateInterest();
		display(account);
	}
}
