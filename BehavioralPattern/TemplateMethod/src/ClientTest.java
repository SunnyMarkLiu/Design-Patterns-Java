/**
 * Author: markliu
 * Time  : 16-9-3 下午4:43
 */
public class ClientTest {

	public static void main(String[] args) {
		Account account = new CurrentAccount();
		account.handlerTemplate("test", "111111", 12000);
	}
}
