
public class Employee2 {
	 int salary;
	int wpd;

	

	public static void main(String[] args) {
	//object
		Employee2 empobj= new Employee2();
		empobj.getInfo(200,9);
		empobj.addSal();
		empobj.addWork();
		System.out.println("The final salary is : "+empobj.salary);
	}
	
	//methods
	
	void getInfo(int salary,int wpd) {
		this.salary=salary;
		this.wpd=wpd;
		
	}
	
	void addSal() {
		if(salary<500) {
			salary += 10;
		}
		
	}
	void addWork() {
		if(wpd>6) {
			salary += 5;
		}
		
	}

}
