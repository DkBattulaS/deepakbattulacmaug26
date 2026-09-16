
public class Employee {
	String name;
	int yearOfJoining;
	String address;
	int salary;

	public static void main(String[] args) {
		System.out.println("Name"+"    "+"Year Of Joining"+"     "+"Address");
		Employee objemp1 = new Employee("Robert",1994,"64C- WallsStreat");
		Employee objemp2 = new Employee("Sam",2000,"68D- WallsStreat");
		Employee objemp3 = new Employee("John",1999,"26B- WallsStreat");
		
		//employee 
		objemp1.displayinfo();
		System.out.println();
		objemp2.displayinfo();
		System.out.println();
		objemp3.displayinfo();

	}
	
	//constructor
	Employee(String name,int yearOfJoining,String address ){
		this.name=name;
		this.yearOfJoining=yearOfJoining;
		this.address=address;
		
	}
	void displayinfo() {
		
		  System.out.print(name+"  ");
		  System.out.print("         ");
		 
		  System.out.print(yearOfJoining+"  ");
		  System.out.print("        ");
		  System.out.print(address+"  ");
		
	
	}

}
