/**
 * Author: markliu
 * Time  : 16-9-4 下午3:39
 */
public class ClientTest {

	public static void main(String[] args) {

		Component button = new Button();
		Component comboBox = new ComboBox();
		Component list = new List();
		Component textBox = new TextBox();

		Mediator mediator = new ConcreteMediator(button, textBox, list, comboBox);

		button.setMediator(mediator);
		comboBox.setMediator(mediator);
		list.setMediator(mediator);
		textBox.setMediator(mediator);

		// 同事对象之间开始相互交互
		button.hasChanged();
		textBox.hasChanged();
		list.hasChanged();
	}
}
