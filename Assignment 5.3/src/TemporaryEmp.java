import java.util.Scanner;

public class TemporaryEmp extends Employee {
	int leave_cnt;
	double basic, hra, pf;
	Scanner inputReader = new Scanner(System.in);

	public TemporaryEmp(int empId, String empName) {
		super(empId, empName);
	}

	@Override
	void calculate_balance_leaves() {
		total_leaves = total_leaves - leave_cnt;
		System.out.println("Leave Available : " + total_leaves);
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		calculate_balance_leaves();
		if (no_of_leaves > total_leaves || total_leaves == 0) {
			return false;
		}
		leave_cnt+=no_of_leaves;
		return true;
	}

	@Override
	void calculate_salary() {
		System.out.println("Enter the basic salary");
		basic = inputReader.nextDouble();
		pf = 0.12 * basic;
		hra = 0.5 * basic;
		total_salary = basic + hra - pf;
		System.out.println("Total Salary is:" + total_salary);
	}
}

/*
******************************************************************************
Output:
Enter the type of Employee:
Press 1 for Permanent Employee
Press 2 for Temporary Employee
2
Enter the Employee-ID: 
12
Enter the Employee Name: 
Akshay
Enter your Choice:
Press 1 to calculate balance leaves
Press 2 to check if leave is allowed or not
Press 3 to calculate salary
3
Enter the basic salary
100
Total Salary is:138.0

Do you wish to see the options again
Press Y for Yes and N for No ?
Y
Enter your Choice:
Press 1 to calculate balance leaves
Press 2 to check if leave is allowed or not
Press 3 to calculate salary
2
Enter the no. of days of leave wanted
6
Leave Available : 5
You are not allowed to take leave

Do you wish to see the options again
Press Y for Yes and N for No ?
Y
Enter your Choice:
Press 1 to calculate balance leaves
Press 2 to check if leave is allowed or not
Press 3 to calculate salary
2
Enter the no. of days of leave wanted
2
Leave Available : 5
You are allowed to take leave

Do you wish to see the options again
Press Y for Yes and N for No ?
Y
Enter your Choice:
Press 1 to calculate balance leaves
Press 2 to check if leave is allowed or not
Press 3 to calculate salary
1
Leave Available : 3

Do you wish to see the options again
Press Y for Yes and N for No ?
N

******************************************************************************
*/