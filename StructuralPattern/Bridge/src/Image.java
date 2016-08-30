/**
 * 实现化角色，一般定义操作复杂的业务
 * Author: markliu
 * Time  : 16-8-31 上午1:30
 */
public abstract class Image {

	protected String name;

	protected ImageImp imageImp;

	public void setImageImp(ImageImp imageImp) {
		this.imageImp = imageImp;
	}

	public abstract void parseImage();
}
