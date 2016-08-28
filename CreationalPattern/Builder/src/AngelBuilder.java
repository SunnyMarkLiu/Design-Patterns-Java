/**
 * Author: markliu
 * Time  : 16-8-28 上午11:14
 */
public class AngelBuilder extends ActorBuilder {
	@Override
	public void buildType() {
		actor.setType("Angel");
	}

	@Override
	public void buildSex() {
		actor.setSex("female");
	}

	@Override
	public void buildFace() {
		actor.setFace("Angel Face");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("Angel Costume");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("Angel Hairstyle");
	}
}
