
public class Student22 {
	//class/instance variables
	String name;
	int rollno;
	String Phoneno;
	String address;
	
	//constructor is a special block in a class that is used to initialize an object
	//A constructor definition needs data types for the parameters.
	//Constructor's job = PUT values into the object
	Student22(String name, int rollno, String Phoneno, String address){
		this.name=name;
		this.rollno=rollno;
		this.Phoneno=Phoneno;
		this.address=address;
	}

	public static void main(String[] args) {
		
		//object of class
		Student22 obj1 = new Student22("john",2,"9272649929","365, Laxmipura,mp"); 
		System.out.println(obj1.name + " "+
				obj1.rollno +" "+
				obj1.Phoneno+" "+
				obj1.address);
		
	}

}
