/**
 * Author: markliu
 * Time  : 16-8-28 上午9:19
 */
public class SpringSkinFactory implements SkinFactory {
	@Override
	public Button createButton() {
		return new SpringButton();
	}

	@Override
	public TextField createTextField() {
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new SpringComboBox();
	}
}
