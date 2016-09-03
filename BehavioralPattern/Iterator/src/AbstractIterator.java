/**
 * Author: markliu
 * Time  : 16-9-3 上午9:29
 */
public interface AbstractIterator {

	void next();
	boolean hasNext();
	void previous();
	boolean hasPrevious();
	Object getNextItem();
	Object getPreviousItem();
}
