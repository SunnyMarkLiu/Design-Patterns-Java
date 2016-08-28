package deep_clone;

import java.io.*;

/**
 * 浅克隆类需要实现 Cloneable 接口
 * Author: markliu
 * Time  : 16-8-28 下午1:23
 */
public class WeeklyLog implements Serializable {

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
	 * 使用序列化技术实现深克隆
	 */
	public WeeklyLog deepClone() {
		try {
			// 将该对象写入流中
			ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
			ObjectOutputStream objectOut = new ObjectOutputStream(byteArrayOut);
			objectOut.writeObject(this);

			// 从对象流中反序列化该对象
			ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(byteArrayOut.toByteArray());
			ObjectInputStream objectIn = new ObjectInputStream(byteArrayIn);
			return (WeeklyLog) objectIn.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}