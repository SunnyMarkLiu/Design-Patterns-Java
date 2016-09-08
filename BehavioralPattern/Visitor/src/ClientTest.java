/**
 * Author: markliu
 * Time  : 16-9-8 下午7:29
 */
public class ClientTest {

	public static void main(String args[]) {
		EmployeeList list = new EmployeeList();
		Employee fte1, fte2, fte3, pte1, pte2;

		fte1 = new FulltimeEmployee("employee1", 3200.00, 45);
		fte2 = new FulltimeEmployee("employee2", 2000.00, 40);
		fte3 = new FulltimeEmployee("employee3", 2400.00, 38);
		pte1 = new ParttimeEmployee("employee4", 80.00, 20);
		pte2 = new ParttimeEmployee("employee5", 60.00, 18);

		list.addEmployee(fte1);
		list.addEmployee(fte2);
		list.addEmployee(fte3);
		list.addEmployee(pte1);
		list.addEmployee(pte2);

		Department dep = new FADepartment();
		list.accept(dep);
	}

}
