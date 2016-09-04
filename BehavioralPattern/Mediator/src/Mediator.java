/**
 * 抽象中介者：它定义一个接口，该接口用于与各同事对象之间进行通信。
 *
 * Author: markliu
 * Time  : 16-9-4 下午3:24
 */
public interface Mediator {

	/**
	 * 封装同事类之间的交互操作
	 * @param component 交互草坐由哪一个组件发起，component 中可以携带触发的具体信息
	 */
	void componentChanged(Component component);
}
