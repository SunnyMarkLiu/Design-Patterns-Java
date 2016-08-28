/**
 * 复杂产品，需要逐步构建
 * Author: markliu
 * Time  : 16-8-28 上午11:03
 */
public class Actor {
	private String type;
	private String sex;
	private String face;
	private String costume;
	private String hairstyle;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getCostume() {
		return costume;
	}

	public void setCostume(String costume) {
		this.costume = costume;
	}

	public String getHairstyle() {
		return hairstyle;
	}

	public void setHairstyle(String hairstyle) {
		this.hairstyle = hairstyle;
	}

	@Override
	public String toString() {
		return "Actor{" +
				"type='" + type + '\'' +
				", sex='" + sex + '\'' +
				", face='" + face + '\'' +
				", costume='" + costume + '\'' +
				", hairstyle='" + hairstyle + '\'' +
				'}';
	}
}
