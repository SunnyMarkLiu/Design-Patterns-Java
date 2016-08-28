package deep_clone;

import java.io.Serializable;

/**
 * 深克隆时，需要克隆的类的属性类也需要实现 Serializable 接口
 * Author: markliu
 * Time  : 16-8-28 下午1:22
 */
public class Attachment implements Serializable{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
