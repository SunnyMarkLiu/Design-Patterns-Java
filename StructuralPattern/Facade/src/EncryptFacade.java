/**
 * Author: markliu
 * Time  : 16-8-31 下午6:23
 */
public class EncryptFacade {

	private FileReader reader;
	private FileWriter writer;
	private CipherMachine cipherMachine;

	public EncryptFacade() {
		reader = new FileReader();
		writer = new FileWriter();
		cipherMachine = new CipherMachine();
	}

	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String readText = reader.read(fileNameSrc);
		String encrypt = cipherMachine.encrypt(readText);
		writer.write(encrypt, fileNameDes);
	}
}
