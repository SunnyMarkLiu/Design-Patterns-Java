/**
 * Author: markliu
 * Time  : 16-8-31 上午1:41
 */
public class ClientTest {

	public static void main(String[] args) {
		// 实际通过读取文件的后缀名选择相应的子类
		Image image = new JPGImage("Sunny.jpg");
		// image = new PNGImage("Sunny.png");
		ImageImp imageImp = new LinuxImageImp();
		image.setImageImp(imageImp);

		image.parseImage();

	}
}
