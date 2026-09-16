import java.util.Scanner;

class Program {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Program Obj = new Program();
		Date objDate = new Date();
		Obj.display(objDate);
		Obj.sc.close();

	}

	void display(Date objDate) {
		// capture using choice
			int choice;

		do {
		System.out.println("======== MENU CHOICES ========");

		System.out.println("1.SET DATE");
		System.out.println("2. ADD DAYS");
		System.out.println("3. ADD MONTHS");
		System.out.println("4. ADD YEARS ");
		System.out.println("5. DISPLAY ");
		System.out.println("6.EXIT");

		System.out.print("Enter your choice (1-6): ");
		 choice = sc.nextInt();

		
		switch (choice) {
		case 1:
			
			System.out.println("ENTER DAY");
			int day = sc.nextInt();

			System.out.println("ENTER MONTH");
			int month = sc.nextInt();

			System.out.println("ENTER YEAR");
			int year = sc.nextInt();
			objDate.setdate(day, month, year); // Go to the objDate object and execute its setDate() method.
			// Tell the objDate object to set its date using these three values
			break;

		case 2:
			
			System.out.println("ENTER number of DAYs to add");
			int days = sc.nextInt();
			objDate.adddays(days);
			break;

		case 3:
			System.out.println("ENTER NUMBERS OF MONTHS");
			int months=sc.nextInt();
			objDate.addmonths(months);
			break;

		case 4:
			System.out.println("ENTER YEARS");
			int years = sc.nextInt();
			objDate.addyears(years);
			break;

		case 5:
	
			objDate.display();
			break;

		case 6:
			System.out.println("EXITING.........");
			break;

		default:
			System.out.println("Invalid choice");
		}
		}while(choice!=6);

	}

}
