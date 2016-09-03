import java.util.List;

/**
 * 抽象聚合类
 * 它用于存储和管理元素对象，声明一个 createIterator() 方法用于创建一个迭代器对象，
 * 充当抽象迭代器工厂角色。
 *
 * Author: markliu
 * Time  : 16-9-3 上午9:12
 */
public abstract class AbstractObjectList {

	private List<Object> objects;

	public AbstractObjectList(List<Object> objects) {
		this.objects = objects;
	}

	public void addObject(Object object) {
		objects.add(object);
	}

	public void removeObject(Object object) {
		if (objects.contains(object))
			objects.remove(object);
	}

	public List<Object> getObjects() {
		return objects;
	}

	public abstract AbstractIterator createIterator();
}
