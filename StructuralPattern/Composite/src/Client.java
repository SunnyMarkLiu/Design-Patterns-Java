/**
 * Author: markliu
 * Time  : 16-8-29 下午4:00
 */
public class Client {

	public static void main(String[] args) {
		AbstractFile folder = new Folder();
		AbstractFile image = new ImageFIle();
		AbstractFile video = new VideoFile();
		AbstractFile text = new TextFile();
		AbstractFile folder1 = new Folder();

		try {
			folder.add(image).add(video).add(text).add(folder1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		folder.killVirus();
	}
}
