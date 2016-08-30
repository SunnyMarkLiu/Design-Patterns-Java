/**
 * Author: markliu
 * Time  : 16-8-31 上午1:36
 */
public class JPGImage extends Image {

	public JPGImage(String name) {
		this.name = name;
	}

	@Override
	public void parseImage() {
		imageImp.doPaint();
		System.out.println("parse JPGImage: " + name);
	}
}
