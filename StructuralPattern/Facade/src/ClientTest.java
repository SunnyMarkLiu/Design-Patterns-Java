/**
 * Author: markliu
 * Time  : 16-8-31 下午6:28
 */
public class ClientTest {

	public static void main(String[] args) {
		EncryptFacade encryptFacade = new EncryptFacade();
		encryptFacade.fileEncrypt("test.txt", "encrypt_test.txt");
	}
}
