import java.util.ArrayList;
import java.util.List;

/**
 * Author: markliu
 * Time  : 16-8-29 下午3:51
 */
public class Folder implements AbstractFile {

	private List<AbstractFile> fileList = new ArrayList<>();

	@Override
	public AbstractFile add(AbstractFile file) throws Exception {
		if (file != null)
			fileList.add(file);
		return this;
	}

	@Override
	public void remove(AbstractFile file) throws Exception {
		fileList.remove(file);
	}

	@Override
	public AbstractFile getChild(int i) throws Exception {
		if (i > 0 && i < fileList.size()) {
			return fileList.get(i);
		} else {
			throw new IllegalArgumentException("illegal argument");
		}
	}

	@Override
	public void killVirus() {
		System.out.println("*** Folder kill virus ***");
		for (AbstractFile file : fileList) {
			file.killVirus();
		}
	}
}
