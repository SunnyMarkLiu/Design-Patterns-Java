/**
 * Author: markliu
 * Time  : 16-9-4 下午12:01
 */
public class ClientTest {

	public static void main(String[] args) {
		FunctionButton functionButton = new FunctionButton("help");
		Command command = new HelpCommand();
		functionButton.setCommand(command);
		functionButton.onClick();

		functionButton = new FunctionButton("minimize window");
		command = new MinimizeCommand();
		functionButton.setCommand(command);
		functionButton.onClick();
	}
}
