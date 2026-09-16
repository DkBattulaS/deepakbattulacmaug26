
public class Traingle {
	int a,b,c;
	
	//constructor with 3 parameters
	
	Traingle(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public static void main(String[] args) {
		Traingle obj = new Traingle(3,4,5); //two shorter sides (3 and 4) serve as the base and the height, while the longest side (5) is the hypotenuse.\(\text{Area}=\frac{1}{2}\times \text{base}\times \text{height}\)
	
		System.out.println("Area of traingle is: "+obj.areaoftraingle());//Call it using the object
		
		//perimeter of a triangle
		System.out.println("perimeter of a triangle is : "+obj.perimeter());
	
	}
	 double areaoftraingle() {
		double area = 0.5*a*b;
		return area;
	}
	int perimeter() {
		return  a+b+c;
		
	}

}
