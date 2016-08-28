/**
 * 英雄角色建造器：具体建造者
 *
 * Author: markliu
 * Time  : 16-8-28 上午11:09
 */
public class HeroBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("Hero");
	}

	@Override
	public void buildSex() {
		actor.setSex("male");
	}

	@Override
	public void buildFace() {
		actor.setFace("Hero Face");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("Hero Costume");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("Hero Hairstyle");
	}
}
