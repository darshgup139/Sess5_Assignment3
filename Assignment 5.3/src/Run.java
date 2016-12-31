import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input, id;
		String name;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the type of Employee:");
		System.out.println("Press 1 for Permanent Employee");
		System.out.println("Press 2 for Temporary Employee");
		input = inputReader.nextInt();
		System.out.println("Enter the Employee-ID: ");
		id = inputReader.nextInt();
		inputReader.nextLine();
		System.out.println("Enter the Employee Name: ");
		name = inputReader.nextLine();

		switch (input) {
		case 1:
			int input1;
			char choice1 = ' ';
			PermanentEmp pe = new PermanentEmp(id, name);
			while (choice1 != 'N') {
				System.out.println("Enter your Choice:");
				System.out.println("Press 1 to view leave details");
				System.out.println("Press 2 to calculate balance leaves");
				System.out.println("Press 3 to check if leave is allowed or not");
				System.out.println("Press 4 to calculate salary");
				input1 = inputReader.nextInt();
				switch (input1) {
				case 1:
					pe.print_leave_details();
					break;
				case 2:
					pe.calculate_balance_leaves();
					break;
				case 3:
					boolean avail;
					int no_of_leaves;
					char type_of_leave;
					System.out.println("Enter the no. of days of leave wanted");
					no_of_leaves = inputReader.nextInt();
					inputReader.nextLine();
					System.out.println("Enter the type of leave: C for Casual Leave P for Paid Leave S for Sick Leave");
					type_of_leave = inputReader.next().charAt(0);
					avail = pe.avail_leave(no_of_leaves, type_of_leave);
					if (avail) {
						System.out.println("You are allowed to take leave");
					} else {
						System.out.println("You are not allowed to take leave");
					}
					break;
				case 4:
					pe.calculate_salary();
					break;
				default:
					System.out.println("Wrong Input");

				}
				System.out.println();
				System.out.println("Do you wish to see the options again\nPress Y for Yes and N for No ?");
				choice1 = inputReader.next().charAt(0);
			}
			break;
		case 2:
			int input2;
			char choice2 = ' ';
			TemporaryEmp te = new TemporaryEmp(id, name);
			while (choice2 != 'N') {
				System.out.println("Enter your Choice:");
				System.out.println("Press 1 to calculate balance leaves");
				System.out.println("Press 2 to check if leave is allowed or not");
				System.out.println("Press 3 to calculate salary");
				input1 = inputReader.nextInt();
				switch (input1) {
				case 1:
					te.calculate_balance_leaves();
					break;
				case 2:
					boolean avail;
					int no_of_leaves;
					char type_of_leave;
					System.out.println("Enter the no. of days of leave wanted");
					no_of_leaves = inputReader.nextInt();
					inputReader.nextLine();
					type_of_leave = 'L';
					avail = te.avail_leave(no_of_leaves, type_of_leave);
					if (avail) {
						System.out.println("You are allowed to take leave");
					} else {
						System.out.println("You are not allowed to take leave");
					}
					break;
				case 3:
					te.calculate_salary();
					break;
				default:
					System.out.println("Wrong Input");

				}
				System.out.println();
				System.out.println("Do you wish to see the options again\nPress Y for Yes and N for No ?");
				choice2 = inputReader.next().charAt(0);
			}
		default:
		}

		inputReader.close();
	}

}
/*
 ******************************************************************************
 * Output pasted in PermanentEmp and TemporaryEmp files.
 ******************************************************************************
 */