import java.util.List;

/**
 * Author: markliu
 * Time  : 16-9-3 上午9:41
 */
public class ProductList extends AbstractObjectList {

	public ProductList(List<Object> objects) {
		super(objects);
	}

	@Override
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}

}
