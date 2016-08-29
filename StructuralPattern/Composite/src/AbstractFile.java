/**
 * 抽象构件：它可以是接口或抽象类，为叶子构件和容器构件对象声明接口，在该角色中可以
 * 包含所有子类共有行为的声明和实现。在抽象构件中定义了访问及管理它的子构件的方法，
 * 如增加子构件、删除子构件、获取子构件等。
 *
 * Author: markliu
 * Time  : 16-8-29 下午3:45
 */
public interface AbstractFile {

	AbstractFile add(AbstractFile file) throws Exception;
	void remove(AbstractFile file) throws Exception;
	AbstractFile getChild(int i) throws Exception;
	void killVirus();
}
