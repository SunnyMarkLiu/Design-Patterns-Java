/**
 * 具体命令类
 * 具体命令类是抽象命令类的子类，实现了在抽象命令类中声明的方法，它对应具体的接收者对象，将接收者对象的动作绑定其中。
 * 在实现execute()方法时，将调用接收者对象的相关操作(Action)。
 *
 * Author: markliu
 * Time  : 16-9-4 上午11:54
 */
public class HelpCommand implements Command {

	private HelpHandler helpHandler;

	public HelpCommand() {
		helpHandler = new HelpHandler();
	}

	@Override
	public void execute() {
		helpHandler.help();
	}
}
