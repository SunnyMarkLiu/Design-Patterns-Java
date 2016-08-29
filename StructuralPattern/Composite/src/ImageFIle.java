/**
 * Author: markliu
 * Time  : 16-8-29 下午3:48
 */
public class ImageFIle implements AbstractFile {

	@Override
	public AbstractFile add(AbstractFile file) throws Exception {
		throw new IllegalAccessException("Not folder!");
	}

	@Override
	public void remove(AbstractFile file) throws Exception {
		throw new IllegalAccessException("Not folder!");
	}

	@Override
	public AbstractFile getChild(int i) throws Exception {
		throw new IllegalAccessException("Not folder!");
	}

	@Override
	public void killVirus() {
		System.out.println("Image file kill virus");
	}
}
