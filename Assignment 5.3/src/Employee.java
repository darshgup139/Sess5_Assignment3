
public class Employee {
	int empId;
	String empName;
	int total_leaves = 5;
	double total_salary;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	void calculate_balance_leaves() {
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		return false;
	}

	void calculate_salary() {
	}
}
