/**
 * 抽象工厂,封装生产一系列相关或相互依赖的产品族
 * Author: markliu
 * Time  : 16-8-28 上午9:18
 */
public interface SkinFactory {

	Button createButton();
	TextField createTextField();
	ComboBox createComboBox();
}
