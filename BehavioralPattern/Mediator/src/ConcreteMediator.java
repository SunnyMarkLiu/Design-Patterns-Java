/**
 * 具体中介者：它是抽象中介者的子类，通过协调各个同事对象来实现协作行为，它维持了对各个同事对象的引用。
 * <p>
 * Author: markliu
 * Time  : 16-9-4 下午3:26
 */
public class ConcreteMediator implements Mediator {

	private Component button;
	private Component textBox;
	private Component list;
	private Component comboBox;

	// 此处简化了，默认按照次顺序构造
	public ConcreteMediator(Component... components) {
		this.button = components[0];
		this.textBox = components[1];
		this.list = components[2];
		this.comboBox = components[3];
	}

	public void setButton(Component button) {
		this.button = button;
	}

	public void setTextBox(Component textBox) {
		this.textBox = textBox;
	}

	/**
	 * 此处存在多个 if - else 嵌套，如果业务复杂，可考虑使用策略模式重构
	 * @param component 交互草坐由哪一个组件发起，component 中可以携带触发的具体信息
	 */
	@Override
	public void componentChanged(Component component) {
		if (component == button) { // 如果由 button 触发
			textBox.update(component);
			list.update(component);
			comboBox.update(component);
		} else if (component == textBox) {    // 如果由 textBox 触发
			button.update(component);
		} else if (component == list) {
			button.update(component);
		} else if (component == comboBox){
			button.update(component);
		}
	}
}
