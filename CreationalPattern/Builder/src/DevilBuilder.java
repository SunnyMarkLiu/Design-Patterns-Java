/**
 * Author: markliu
 * Time  : 16-8-28 上午11:15
 */
public class DevilBuilder extends ActorBuilder {
	@Override
	public void buildType() {
		actor.setType("Devil");
	}

	@Override
	public void buildSex() {
		actor.setSex("male");
	}

	@Override
	public void buildFace() {
		actor.setFace("Devil Face");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("Devil Costume");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("Devil Hairstyle");
	}
}
