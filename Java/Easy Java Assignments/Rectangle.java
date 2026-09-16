
public class Rectangle {
	int area; // instance variable
	int lenght,breadth;
	
	//constructor 
	Rectangle(int lenght, int breadth){
		this.lenght= lenght;
		this.breadth=breadth;
		
	}

	public static void main(String[] args) {
		//object of class Rectangle
		
		Rectangle obj = new Rectangle(4,5);
		Rectangle obj2 = new Rectangle(5,8);
		System.out.println(obj2.area());
		System.out.println(obj.area());

	}
	
	//area method
	
	int area(){
		System.out.println("The Rectangle1 area is : ");
		return lenght*breadth;
		
	}

}
