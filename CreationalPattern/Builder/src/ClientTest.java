/**
 * Author: markliu
 * Time  : 16-8-28 上午10:56
 */
public class ClientTest {

	public static void main(String[] args) {
		ActorBuilder actorBuilder = new HeroBuilder();
		Actor actor = actorBuilder.build();
		System.out.println(actor);

		actorBuilder = new AngelBuilder();
		actor = actorBuilder.build();
		System.out.println(actor);
	}
}
