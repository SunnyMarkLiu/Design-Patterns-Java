/**
 * Author: markliu
 * Time  : 16-8-28 上午11:04
 */
public abstract class ActorBuilder {

	protected Actor actor;

	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairstyle();

	public Actor build() {
		actor = new Actor();
		buildType();
		buildSex();
		buildFace();
		buildCostume();
		buildHairstyle();
		return actor;
	}
}
