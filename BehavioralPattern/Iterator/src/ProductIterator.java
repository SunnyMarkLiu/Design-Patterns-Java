import java.util.List;

/**
 * Author: markliu
 * Time  : 16-9-3 上午9:33
 */
public class ProductIterator implements AbstractIterator {

	private AbstractObjectList objectList;	// 维持聚合类的引用
	private List<Object> objects;

	private int nextCursor; //定义一个游标，用于记录正向遍历的位置
	private int previousCursor; //定义一个游标，用于记录逆向遍历的位置

	public ProductIterator(AbstractObjectList objectList) {
		this.objectList = objectList;
		this.objects = this.objectList.getObjects();
		nextCursor = 0;
		previousCursor = objects.size() - 1;
	}

	@Override
	public void next() {
		if (nextCursor < objects.size()) {
			nextCursor++;
		}
	}

	@Override
	public boolean hasNext() {
		return nextCursor < objects.size();
	}

	@Override
	public void previous() {
		if (previousCursor > -1) {
			previousCursor--;
		}
	}

	@Override
	public boolean hasPrevious() {
		return previousCursor > -1;
	}

	@Override
	public Object getNextItem() {
		return objects.get(nextCursor);
	}

	@Override
	public Object getPreviousItem() {
		return objects.get(previousCursor);
	}
}
