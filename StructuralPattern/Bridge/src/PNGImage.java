/**
 * Author: markliu
 * Time  : 16-8-31 上午1:36
 */
public class PNGImage extends Image {

	public PNGImage(String name) {
		this.name = name;
	}

	@Override
	public void parseImage() {
		imageImp.doPaint();
		System.out.println("parse PNGImage: " + name);
	}
}
