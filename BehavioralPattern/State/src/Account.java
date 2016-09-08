/**
 * Author: markliu
 * Time  : 16-9-8 下午2:34
 */
public class Account {

	private AccountState state; // 维持一个对抽象状态对象的引用
	private String owner;
	private double balance = 0; // 账户余额

	public Account(String owner, double initBalance) {
		this.owner = owner;
		this.balance = initBalance;
		this.state = new NormalState(this); //设置初始状态
		System.out.println(this.owner + "开户，初始金额为" + initBalance);
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setState(AccountState state) {
		this.state = state;
	}

	public void deposit(double amount) {
		System.out.println(this.owner + "存款" + amount);
		state.deposit(amount); // 调用状态对象的deposit()方法
		System.out.println("现在余额为" + this.balance);
		System.out.println("现在帐户状态为" + this.state.getClass().getName());
	}

	public void withdraw(double amount) {
		System.out.println(this.owner + "取款" + amount);
		state.withdraw(amount); // 调用状态对象的withdraw()方法
		System.out.println("现在余额为" + this.balance);
		System.out.println("现在帐户状态为" + this.state.getClass().getName());
	}

	public void computeInterest() {
		state.computeInterest(); //调用状态对象的computeInterest()方法
	}
}
