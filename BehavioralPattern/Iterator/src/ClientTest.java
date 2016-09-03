import java.util.ArrayList;
import java.util.List;

/**
 * Author: markliu
 * Time  : 16-9-3 上午9:43
 */
public class ClientTest {

	public static void main(String[] args) {
		List<Object> objects = new ArrayList<>();
		objects.add("product0");
		objects.add("product1");
		objects.add("product2");
		objects.add("product3");

		// 创建聚合类
		AbstractObjectList objectList = new ProductList(objects);
		AbstractIterator iterator = objectList.createIterator();

		System.out.println("正向遍历:");

		// 迭代器遍历
		while (iterator.hasNext()) {
			Object items = iterator.getNextItem();
			System.out.println(items);
			iterator.next();
		}

		System.out.println("逆向遍历:");

		// 迭代器遍历
		while (iterator.hasPrevious()) {
			Object items = iterator.getPreviousItem();
			System.out.println(items);
			iterator.previous();
		}
	}
}
