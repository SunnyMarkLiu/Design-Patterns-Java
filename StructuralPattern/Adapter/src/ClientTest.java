/**
 * Author: markliu
 * Time  : 16-8-28 下午5:37
 */
public class ClientTest {

	public static void main(String[] args) {
		ScoreOperation scoreOperation = new OperationAdapter();

		int score[] = {1, 2, 3};
		scoreOperation.sort(score);
		scoreOperation.search(score, 1);
	}
}
