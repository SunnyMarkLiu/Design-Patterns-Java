/**
 * Author: markliu
 * Time  : 16-9-8 下午2:35
 */
public abstract class AccountState {

	protected Account acc;
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void computeInterest();
	public abstract void stateCheck();
}
