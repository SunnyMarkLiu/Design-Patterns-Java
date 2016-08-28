package shallow_clone;

/**
 * 浅克隆类需要实现 Cloneable 接口
 * Author: markliu
 * Time  : 16-8-28 下午1:23
 */
public class WeeklyLog implements Cloneable {

	private Attachment attachment;

	private String name;
	private String date;
	private String content;

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 浅克隆
	 */
	public WeeklyLog shallowClone() {
		try {
			return (WeeklyLog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
