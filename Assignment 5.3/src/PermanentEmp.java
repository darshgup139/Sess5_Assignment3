import java.util.Scanner;

public class PermanentEmp extends Employee {
	int paid_leave, sick_leave, casual_leave;
	double basic, hra, pf;
	Scanner inputReader = new Scanner(System.in);

	public PermanentEmp(int empId, String empName) {
		super(empId, empName);
	}

	/*
	 * public PermanentEmp(int empId, String empName, double total_salary, int
	 * paid_leave, int sick_leave, int casual_leave, double basic, double hra,
	 * double pfa) { super(empId, empName,total_salary); this.paid_leave =
	 * paid_leave; this.sick_leave = sick_leave; this.casual_leave =
	 * casual_leave; this.basic = basic; this.hra = hra; this.pfa = pfa; }
	 */

	void print_leave_details() {
		System.out.println("No. of Paid Leaves are: " + paid_leave);
		System.out.println("No. of Sick Leaves are: " + sick_leave);
		System.out.println("No. of Casual Leaves are: " + casual_leave);
	}

	@Override
	void calculate_balance_leaves() {
		total_leaves = total_leaves - (paid_leave + sick_leave + casual_leave);
		System.out.println("Leave Available : " + total_leaves);
		// return temp;
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {

		calculate_balance_leaves();
		if (no_of_leaves > total_leaves || total_leaves == 0) {
			return false;
		}
		if (type_of_leave == 'C') {
			casual_leave += no_of_leaves;
		} else if (type_of_leave == 'p') {
			paid_leave += no_of_leaves;
		} else
			sick_leave += no_of_leaves;
		return true;

	}

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
1
Enter the Employee-ID: 
11
Enter the Employee Name: 
Adarsh
Enter your Choice:
Press 1 to view leave details
Press 2 to calculate balance leaves
Press 3 to check if leave is allowed or not
Press 4 to calculate salary
3
Enter the no. of days of leave wanted
2
Enter the type of leave: C for Casual Leave P for Paid Leave S for Sick Leave
C
Leave Available : 5
You are allowed to take leave

Do you wish to see the options again
Press Y for Yes and N for No ?
Y
Y
Enter your Choice:
Press 1 to view leave details
Press 2 to calculate balance leaves
Press 3 to check if leave is allowed or not
Press 4 to calculate salary
2
Leave Available : 3

Do you wish to see the options again
Press Y for Yes and N for No ?
Y
Y
Enter your Choice:
Press 1 to view leave details
Press 2 to calculate balance leaves
Press 3 to check if leave is allowed or not
Press 4 to calculate salary
1
No. of Paid Leaves are: 0
No. of Sick Leaves are: 0
No. of Casual Leaves are: 2

Do you wish to see the options again
Press Y for Yes and N for No ?
Y
Y
Enter your Choice:
Press 1 to view leave details
Press 2 to calculate balance leaves
Press 3 to check if leave is allowed or not
Press 4 to calculate salary
4
Enter the basic salary
1000
Total Salary is:1380.0

Do you wish to see the options again
Press Y for Yes and N for No ?
N
******************************************************************************
*/