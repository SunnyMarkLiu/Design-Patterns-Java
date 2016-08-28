/**
 * Author: markliu
 * Time  : 16-8-28 上午9:29
 */
public class ClientTest {

	public static void main(String[] args) {
		SkinFactory skinFactory = new SpringSkinFactory();
		// SkinFactory skinFactory = new SummerSkinFactory();
		Button button = skinFactory.createButton();
		TextField textField = skinFactory.createTextField();
		ComboBox comboBox = skinFactory.createComboBox();

		button.display();
		textField.display();
		comboBox.display();
	}
}
