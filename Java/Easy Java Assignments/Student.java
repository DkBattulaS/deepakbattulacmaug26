
public class Student {

	String name;
	int rollno;
	String Phoneno;
	String address;

	public static void main(String[] args) {

		// object of class student

		Student obj1 = new Student();
		Student obj2 = new Student();

		obj1.name = "john";
		obj1.rollno = 2;
		obj1.Phoneno="9272649929";
		obj1.address = "365, Laxmipura,mp";
		obj2.rollno = 3;
		obj2.address = "383, shitla devi mandir, navibasti";
		obj2.Phoneno="9927262629";
		obj2.name = "Sam";
		
		System.out.println("THE OBJECT 1:");
		System.out.println("NAME: "+obj1.name);
		System.out.println("PHONE NUBER: "+obj1.Phoneno);
		System.out.println("ROLL NO" + obj1.rollno);
		System.out.println("ADDRESS "+obj1.address);
		System.out.println();
		System.out.println("THE OBJECT 2:");
		System.out.println("NAME: "+obj2.name);
		System.out.println("PHONE NUBER: "+obj2.Phoneno);
		System.out.println("ROLL NO" + obj2.rollno);
		System.out.println("ADDRESS "+obj2.address);

	}

}
