/**
 * Author: markliu
 * Time  : 16-9-8 下午7:26
 */
public abstract class Department {
	//声明一组重载的访问方法，用于访问不同类型的具体元素
	public abstract void visit(FulltimeEmployee employee);

	public abstract void visit(ParttimeEmployee employee);
}
