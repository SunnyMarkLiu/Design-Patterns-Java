/**
 * Author: markliu
 * Time  : 16-9-8 下午2:50
 */
public class ClientTest {

	public static void main(String[] args) {
		Account account = new Account("Sunny", 100);
		account.deposit(1000);
		account.withdraw(2000);
		account.deposit(3000);
		account.withdraw(4000);
		account.withdraw(1000);
	}
}
