/**
 * 调用者,即请求发送者
 * 它通过命令对象来执行请求。一个调用者并不需要在设计时确定其接收者，因此它只与抽象命令类之间存在关联关系。
 * 在程序运行时可以将一个具体命令对象注入其中，再调用具体命令对象的 execute() 方法，从而实现间接调用请求
 * 接收者的相关操作。
 *
 * Author: markliu
 * Time  : 16-9-4 上午11:53
 */
public class FunctionButton {

	private Command command;
	private String name;

	public FunctionButton(String name) {
		this.name = name;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void onClick() {
		System.out.println(name + " onClick");
		command.execute();
	}
}
