/**
 * Author: markliu
 * Time  : 16-9-8 下午7:25
 */
public class FulltimeEmployee implements Employee {
	private String name;
	private double weeklyWage;
	private int workTime;

	public FulltimeEmployee(String name, double weeklyWage, int workTime) {
		this.name = name;
		this.weeklyWage = weeklyWage;
		this.workTime = workTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeeklyWage(double weeklyWage) {
		this.weeklyWage = weeklyWage;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public String getName() {
		return (this.name);
	}

	public double getWeeklyWage() {
		return (this.weeklyWage);
	}

	public int getWorkTime() {
		return (this.workTime);
	}

	public void accept(Department handler) {
		handler.visit(this); //调用访问者的访问方法
	}
}
