/**
 * Author: markliu
 * Time  : 16-8-31 下午8:29
 */
public class ClientTest {

	public static void main(String[] args) {
		Component window = new Window();
		Component scrollBarWindow = new ScrollBarDecorator(window);
		Component blackBorderScrollBarWindow = new BlackBorderDecorator(scrollBarWindow);

		blackBorderScrollBarWindow.display();
	}

}
