/**
 * Author: markliu
 * Time  : 16-8-31 上午1:36
 */
public class GIFImage extends Image {

	public GIFImage(String name) {
		this.name = name;
	}

	@Override
	public void parseImage() {
		imageImp.doPaint();
		System.out.println("parse GIFImage: " + name);
	}
}
