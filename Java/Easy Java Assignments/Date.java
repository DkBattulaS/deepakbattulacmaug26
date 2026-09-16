
public class Date {

	private int day;
	private int month;
	private int year;

	public static void main(String[] args) {
	}

	public void setdate(int dd, int mm, int yy) {
		day = dd;
		month = mm;
		year = yy;
		// need to validate the user entered month and actual days in that month
		// we use if loop for that

		if (mm < 1 || mm > 12) {
			System.out.println("Invalid month");
			return;
		}
		if (dd < 1 || dd > daysinmonth(month, year)) {
			System.out.println("Invalid days entered for this month");
			return;
		}

	}

	public void display() {
		System.out.println(day + "/" + month + "/" + year);
	}

	private boolean isLeapYear(int year) { // Why private?//Because isLeapYear() is an internal helper method. We will
											// use it from inside Date when checking February and adding years.//

		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

	void adddays(int days) {
		for (int itemp = 0; itemp < days; itemp++) {
			day++;

			if (day > daysinmonth(month, year)) {
				day = 1;
				month++;
			}

				if (month > 12) {
					month = 1;
					year++;
				
			}
		}
	}

	void addyears(int years) {
		year += years;
		if (day > daysinmonth(month, year)) {		// Adjust day if it exceeds the maximum days in the new month/year
	        day = daysinmonth(month, year);
	    }
	}

//we need a method for how many days in months are there
//in a calendar the month 1,3,5,7,8,10,12 with 31 days rest 4,6,9,11 with 30 days and feb 

	private int daysinmonth(int month, int year) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		else if (month == 2)
			if (isLeapYear(year))
				return 29;
			else
				return 28;
		else
			return 30;

	}
	
	void addmonths(int months) {
		
		month += months;
		while(month>12){
			month -= 12;
			year++;
		}
		if(day>daysinmonth(month,year)) {		// Adjust day if it exceeds the maximum days in the new month/year
			day = daysinmonth(month,year);
		}
	}
}
